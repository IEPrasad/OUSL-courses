import React, { useState } from 'react';
import {
  View,
  Text,
  TouchableOpacity,
  StyleSheet,
  Image,
  SafeAreaView,
  StatusBar,
  ScrollView,
  TextInput,
  Switch,
  ActivityIndicator,
  Alert,
  FlatList,
  RefreshControl,
  Dimensions,
} from 'react-native';
import { useRouter } from 'expo-router';

const { width } = Dimensions.get('window');

const HomeScreen = () => {
  const router = useRouter();
  const [searchQuery, setSearchQuery] = useState('');
  const [isLoading, setIsLoading] = useState(false);
  const [notificationsEnabled, setNotificationsEnabled] = useState(true);
  const [refreshing, setRefreshing] = useState(false);

  const features = [
    { id: '1', title: 'Advanced Dashboard', status: 'Active' },
    { id: '2', title: 'Real-time Analytics', status: 'Beta' },
    { id: '3', title: 'Secure Authentication', status: 'Active' },
    { id: '4', title: 'Cloud Storage', status: 'Maintenance' },
    { id: '5', title: 'Push Notifications', status: 'Active' },
  ];

  const recentActivities = [
    { id: '1', title: 'Project Update', time: '2 hours ago', desc: 'New features added to dashboard' },
    { id: '2', title: 'System Alert', time: '4 hours ago', desc: 'Server maintenance completed' },
    { id: '3', title: 'New Message', time: '5 hours ago', desc: 'You have 3 new messages' },
    { id: '4', title: 'Task Completed', time: '1 day ago', desc: 'Analytics report generated' },
    { id: '5', title: 'Security Update', time: '2 days ago', desc: 'System security enhanced' },
  ];

  const handleSearch = () => {
    setIsLoading(true);
    setTimeout(() => {
      setIsLoading(false);
      Alert.alert('Search', `Searching for: ${searchQuery}`);
    }, 1000);
  };

  const onRefresh = React.useCallback(() => {
    setRefreshing(true);
    setTimeout(() => {
      setRefreshing(false);
    }, 2000);
  }, []);

  const renderFeatureItem = ({ item }) => (
    <View style={styles.featureItem}>
      <View style={styles.featureHeader}>
        <Text style={styles.featureTitle}>{item.title}</Text>
        <View style={[
          styles.statusBadge,
          { backgroundColor: item.status === 'Active' ? '#4CAF50' : 
                           item.status === 'Beta' ? '#FF9800' : '#F44336' }
        ]}>
          <Text style={styles.statusText}>{item.status}</Text>
        </View>
      </View>
    </View>
  );

  const renderActivityItem = ({ item }) => (
    <View style={styles.activityItem}>
      <View style={styles.activityHeader}>
        <Text style={styles.activityTitle}>{item.title}</Text>
        <Text style={styles.activityTime}>{item.time}</Text>
      </View>
      <Text style={styles.activityDesc}>{item.desc}</Text>
    </View>
  );

  return (
    <SafeAreaView style={styles.container}>
      <StatusBar barStyle="light-content" backgroundColor="#1a1a1a" />
      
      {/* Fixed Header */}
      <View style={styles.header}>
        <Image
          source={{ uri: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3flIHsvZtK3eU7tEnp-LSEjNznTZCn0dkcA&s' }}
          style={styles.profilePic}
        />
        <View style={styles.headerTextContainer}>
          {/* <Text style={styles.welcomeText}>Welcome back</Text> */}
          <Text style={styles.nameText}>J.V.G.I.E Prasad</Text>
        </View>
        <View style={styles.notificationContainer}>
          <Text style={styles.notificationText}>Notifications</Text>
          <Switch
            value={notificationsEnabled}
            onValueChange={setNotificationsEnabled}
            trackColor={{ false: '#767577', true: '#81b0ff' }}
            thumbColor={notificationsEnabled ? '#007AFF' : '#f4f3f4'}
          />
        </View>
      </View>

      {/* Main Scrollable Content */}
      <ScrollView
        style={styles.scrollView}
        showsVerticalScrollIndicator={true}
        refreshControl={
          <RefreshControl
            refreshing={refreshing}
            onRefresh={onRefresh}
            tintColor="#007AFF"
            title="Pull to refresh"
            titleColor="#999"
          />
        }
      >
        {/* Search Section */}
        <View style={styles.searchContainer}>
          <TextInput
            style={styles.searchInput}
            placeholder="Search features..."
            placeholderTextColor="#999"
            value={searchQuery}
            onChangeText={setSearchQuery}
            onSubmitEditing={handleSearch}
          />
          {isLoading ? (
            <ActivityIndicator color="#007AFF" style={styles.searchIcon} />
          ) : (
            <TouchableOpacity onPress={handleSearch} style={styles.searchButton}>
              <Text style={styles.searchButtonText}>Search</Text>
            </TouchableOpacity>
          )}
        </View>

        {/* Horizontal Scroll for Quick Actions */}
        <View style={styles.quickActionsContainer}>
          <Text style={styles.sectionTitle}>Quick Actions</Text>
          <ScrollView 
            horizontal
            showsHorizontalScrollIndicator={true}
            contentContainerStyle={styles.horizontalScrollContent}
          >
            {['Statistics', 'Projects', 'Tasks', 'Reports', 'Settings', 'Help'].map((action, index) => (
              <TouchableOpacity 
                key={index}
                style={styles.actionButton}
                onPress={() => Alert.alert(action, `Opening ${action.toLowerCase()}...`)}
              >
                <Text style={styles.actionButtonText}>{action}</Text>
              </TouchableOpacity>
            ))}
          </ScrollView>
        </View>

        {/* Features List Section */}
        <View style={styles.featuresContainer}>
          <Text style={styles.sectionTitle}>Features Overview</Text>
          <FlatList
            data={features}
            renderItem={renderFeatureItem}
            keyExtractor={item => item.id}
            scrollEnabled={false}
          />
        </View>

        {/* Recent Activities Section */}
        <View style={styles.activitiesContainer}>
          <Text style={styles.sectionTitle}>Recent Activities</Text>
          <FlatList
            data={recentActivities}
            renderItem={renderActivityItem}
            keyExtractor={item => item.id}
            scrollEnabled={false}
          />
        </View>

        {/* Auth Buttons */}
        <View style={styles.authButtons}>
          <TouchableOpacity
            style={styles.loginButton}
            onPress={() => router.push('/login')}
          >
            <Text style={styles.loginButtonText}>Login</Text>
          </TouchableOpacity>

          <TouchableOpacity
            style={styles.signupButton}
            onPress={() => router.push('/signup')}
          >
            <Text style={styles.signupButtonText}>Sign Up</Text>
          </TouchableOpacity>
        </View>
      </ScrollView>
    </SafeAreaView>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#1a1a1a',
  },
  scrollView: {
    flex: 1,
  },
  header: {
    flexDirection: 'row',
    alignItems: 'center',
    padding: 20,
    backgroundColor: '#252525',
    borderBottomWidth: 1,
    borderBottomColor: '#333',
  },
  profilePic: {
    width: 60,
    height: 60,
    borderRadius: 50,
    borderWidth: 3,
    borderColor: '#007AFF',
  },
  headerTextContainer: {
    flex: 1,
    marginLeft: 15,
  },
  welcomeText: {
    fontSize: 14,
    color: '#999',
  },
  nameText: {
    fontSize: 18,
    fontWeight: 'bold',
    color: '#fff',
  },
  notificationContainer: {
    alignItems: 'center',
  },
  notificationText: {
    color: '#999',
    fontSize: 12,
    marginBottom: 5,
  },
  searchContainer: {
    flexDirection: 'row',
    padding: 20,
    alignItems: 'center',
  },
  searchInput: {
    flex: 1,
    height: 40,
    backgroundColor: '#252525',
    borderRadius: 8,
    paddingHorizontal: 15,
    color: '#fff',
    marginRight: 10,
  },
  searchButton: {
    backgroundColor: '#007AFF',
    padding: 10,
    borderRadius: 8,
  },
  searchButtonText: {
    color: '#fff',
    fontWeight: '600',
  },
  searchIcon: {
    marginLeft: 10,
  },
  sectionTitle: {
    fontSize: 20,
    fontWeight: 'bold',
    color: '#fff',
    marginBottom: 15,
    paddingHorizontal: 20,
  },
  quickActionsContainer: {
    marginVertical: 20,
  },
  horizontalScrollContent: {
    paddingHorizontal: 15,
  },
  actionButton: {
    backgroundColor: '#252525',
    padding: 15,
    borderRadius: 10,
    marginHorizontal: 5,
    minWidth: 100,
  },
  actionButtonText: {
    color: '#fff',
    textAlign: 'center',
    fontWeight: '600',
  },
  featuresContainer: {
    backgroundColor: '#252525',
    marginHorizontal: 20,
    borderRadius: 15,
    marginBottom: 20,
    padding: 20,
  },
  featureItem: {
    backgroundColor: '#333',
    padding: 15,
    borderRadius: 10,
    marginBottom: 10,
  },
  featureHeader: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
  },
  featureTitle: {
    color: '#fff',
    fontSize: 16,
    fontWeight: '500',
  },
  statusBadge: {
    paddingHorizontal: 8,
    paddingVertical: 4,
    borderRadius: 12,
  },
  statusText: {
    color: '#fff',
    fontSize: 12,
    fontWeight: '600',
  },
  activitiesContainer: {
    marginBottom: 20,
  },
  activityItem: {
    backgroundColor: '#252525',
    padding: 15,
    marginHorizontal: 20,
    borderRadius: 10,
    marginBottom: 10,
  },
  activityHeader: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    marginBottom: 5,
  },
  activityTitle: {
    color: '#fff',
    fontSize: 16,
    fontWeight: '500',
  },
  activityTime: {
    color: '#999',
    fontSize: 12,
  },
  activityDesc: {
    color: '#ccc',
    fontSize: 14,
  },
  authButtons: {
    padding: 20,
    marginBottom: 20,
  },
  loginButton: {
    backgroundColor: '#007AFF',
    padding: 15,
    borderRadius: 10,
    marginBottom: 15,
  },
  loginButtonText: {
    color: '#ffffff',
    fontSize: 16,
    fontWeight: '600',
    textAlign: 'center',
  },
  signupButton: {
    backgroundColor: 'transparent',
    padding: 15,
    borderRadius: 10,
    borderWidth: 1,
    borderColor: '#007AFF',
  },
  signupButtonText: {
    color: '#007AFF',
    fontSize: 16,
    fontWeight: '600',
    textAlign: 'center',
  },
});

export default HomeScreen;

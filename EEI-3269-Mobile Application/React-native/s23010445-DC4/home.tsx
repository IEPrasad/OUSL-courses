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

  const socialApps = [
    { id: '1', title: 'Instagram', icon: '📸', color: '#E1306C' },
    { id: '2', title: 'Twitter', icon: '🐦', color: '#1DA1F2' },
    { id: '3', title: 'TikTok', icon: '🎵', color: '#000000' },
    { id: '4', title: 'LinkedIn', icon: '💼', color: '#0077B5' },
    { id: '5', title: 'Pinterest', icon: '📌', color: '#E60023' },
    { id: '6', title: 'WhatsApp', icon: '💬', color: '#25D366' },
  ];

  const activities = [
    { 
      id: '1', 
      title: 'New Followers', 
      time: '2m ago', 
      desc: '+15 new followers today',
      icon: '👥',
      color: '#FF6B6B'
    },
    { 
      id: '2', 
      title: 'Trending Post', 
      time: '1h ago', 
      desc: 'Your post is trending in #photography',
      icon: '🔥',
      color: '#4ECDC4'
    },
    { 
      id: '3', 
      title: 'Story Views', 
      time: '3h ago', 
      desc: '324 people viewed your story',
      icon: '👁️',
      color: '#45B7D1'
    },
    { 
      id: '4', 
      title: 'Messages', 
      time: '5h ago', 
      desc: '7 unread messages',
      icon: '✉️',
      color: '#96CEB4'
    }
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

  const renderSocialApp = ({ item }) => (
    <TouchableOpacity 
      style={[styles.socialAppCard, { backgroundColor: item.color }]}
      onPress={() => Alert.alert(item.title, `Opening ${item.title}...`)}
    >
      <Text style={styles.socialAppIcon}>{item.icon}</Text>
      <Text style={styles.socialAppTitle}>{item.title}</Text>
    </TouchableOpacity>
  );

  const renderActivity = ({ item }) => (
    <TouchableOpacity 
      style={[styles.activityCard, { borderLeftColor: item.color }]}
      onPress={() => Alert.alert(item.title, item.desc)}
    >
      <View style={styles.activityContent}>
        <Text style={styles.activityIcon}>{item.icon}</Text>
        <View style={styles.activityInfo}>
          <Text style={styles.activityTitle}>{item.title}</Text>
          <Text style={styles.activityDesc}>{item.desc}</Text>
        </View>
        <Text style={styles.activityTime}>{item.time}</Text>
      </View>
    </TouchableOpacity>
  );

  return (
    <SafeAreaView style={styles.container}>
      <StatusBar barStyle="light-content" backgroundColor="#1A1A2E" />
      
      {/* Header */}
      <View style={styles.header}>
        <View style={styles.headerLeft}>
          <Image
            source={{ uri: 'https://randomuser.me/api/portraits/women/44.jpg' }}
            style={styles.profilePic}
          />
          <View style={styles.headerText}>
            <Text style={styles.welcomeText}>Welcome back,</Text>
            <Text style={styles.nameText}>Lakshika</Text>
          </View>
        </View>
        <TouchableOpacity style={styles.notificationBell}>
          <Text style={styles.bellIcon}>🔔</Text>
          <View style={styles.notificationBadge}>
            <Text style={styles.badgeText}>3</Text>
          </View>
        </TouchableOpacity>
      </View>

      <ScrollView
        style={styles.scrollView}
        showsVerticalScrollIndicator={false}
        refreshControl={
          <RefreshControl
            refreshing={refreshing}
            onRefresh={onRefresh}
            tintColor="#FFD93D"
          />
        }
      >
        {/* Search Bar */}
        <View style={styles.searchContainer}>
          <View style={styles.searchWrapper}>
            <Text style={styles.searchIcon}>🔍</Text>
            <TextInput
              style={styles.searchInput}
              placeholder="Search..."
              placeholderTextColor="#6B728E"
              value={searchQuery}
              onChangeText={setSearchQuery}
            />
            {isLoading && <ActivityIndicator color="#FFD93D" />}
          </View>
        </View>

        {/* Social Apps Grid */}
        <View style={styles.sectionContainer}>
          <Text style={styles.sectionTitle}>Social Apps</Text>
          <FlatList
            data={socialApps}
            renderItem={renderSocialApp}
            keyExtractor={item => item.id}
            numColumns={3}
            scrollEnabled={false}
            columnWrapperStyle={styles.socialAppsRow}
          />
        </View>

        {/* Quick Actions */}
        <View style={styles.sectionContainer}>
          <Text style={styles.sectionTitle}>Quick Actions</Text>
          <ScrollView 
            horizontal 
            showsHorizontalScrollIndicator={false}
            contentContainerStyle={styles.quickActionsContainer}
          >
            {['Create Post', 'New Story', 'Live Stream', 'Messages', 'Settings'].map((action, index) => (
              <TouchableOpacity 
                key={index}
                style={styles.quickActionButton}
              >
                <Text style={styles.quickActionText}>{action}</Text>
              </TouchableOpacity>
            ))}
          </ScrollView>
        </View>

        {/* Recent Activity */}
        <View style={styles.sectionContainer}>
          <Text style={styles.sectionTitle}>Recent Activity</Text>
          <FlatList
            data={activities}
            renderItem={renderActivity}
            keyExtractor={item => item.id}
            scrollEnabled={false}
          />
        </View>

        {/* Logout Button */}
        <TouchableOpacity
          style={styles.logoutButton}
          onPress={() => router.push('/(tabs)')}
        >
          <Text style={styles.logoutText}>Logout</Text>
        </TouchableOpacity>
      </ScrollView>
    </SafeAreaView>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#1A1A2E',
  },
  header: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    padding: 20,
    backgroundColor: '#16213E',
  },
  headerLeft: {
    flexDirection: 'row',
    alignItems: 'center',
  },
  profilePic: {
    width: 50,
    height: 50,
    borderRadius: 25,
    borderWidth: 2,
    borderColor: '#FFD93D',
  },
  headerText: {
    marginLeft: 15,
  },
  welcomeText: {
    color: '#6B728E',
    fontSize: 14,
  },
  nameText: {
    color: '#E94560',
    fontSize: 20,
    fontWeight: 'bold',
  },
  notificationBell: {
    position: 'relative',
  },
  bellIcon: {
    fontSize: 24,
  },
  notificationBadge: {
    position: 'absolute',
    top: -5,
    right: -5,
    backgroundColor: '#E94560',
    borderRadius: 10,
    width: 20,
    height: 20,
    justifyContent: 'center',
    alignItems: 'center',
  },
  badgeText: {
    color: '#FFFFFF',
    fontSize: 12,
    fontWeight: 'bold',
  },
  scrollView: {
    flex: 1,
  },
  searchContainer: {
    padding: 20,
  },
  searchWrapper: {
    flexDirection: 'row',
    alignItems: 'center',
    backgroundColor: '#16213E',
    borderRadius: 15,
    padding: 10,
  },
  searchIcon: {
    fontSize: 20,
    marginRight: 10,
  },
  searchInput: {
    flex: 1,
    color: '#FFFFFF',
    fontSize: 16,
  },
  sectionContainer: {
    marginBottom: 25,
  },
  sectionTitle: {
    color: '#FFFFFF',
    fontSize: 22,
    fontWeight: 'bold',
    marginBottom: 15,
    paddingHorizontal: 20,
  },
  socialAppsRow: {
    justifyContent: 'space-between',
    paddingHorizontal: 20,
  },
  socialAppCard: {
    width: width / 3 - 30,
    height: 100,
    borderRadius: 15,
    marginBottom: 15,
    padding: 15,
    alignItems: 'center',
    justifyContent: 'center',
  },
  socialAppIcon: {
    fontSize: 30,
    marginBottom: 5,
  },
  socialAppTitle: {
    color: '#FFFFFF',
    fontSize: 14,
    fontWeight: '500',
  },
  quickActionsContainer: {
    paddingHorizontal: 15,
  },
  quickActionButton: {
    backgroundColor: '#E94560',
    paddingVertical: 12,
    paddingHorizontal: 20,
    borderRadius: 25,
    marginHorizontal: 5,
  },
  quickActionText: {
    color: '#FFFFFF',
    fontSize: 14,
    fontWeight: '600',
  },
  activityCard: {
    backgroundColor: '#16213E',
    marginHorizontal: 20,
    marginBottom: 10,
    borderRadius: 15,
    borderLeftWidth: 4,
    overflow: 'hidden',
  },
  activityContent: {
    flexDirection: 'row',
    alignItems: 'center',
    padding: 15,
  },
  activityIcon: {
    fontSize: 24,
    marginRight: 15,
  },
  activityInfo: {
    flex: 1,
  },
  activityTitle: {
    color: '#FFFFFF',
    fontSize: 16,
    fontWeight: '600',
    marginBottom: 5,
  },
  activityDesc: {
    color: '#6B728E',
    fontSize: 14,
  },
  activityTime: {
    color: '#6B728E',
    fontSize: 12,
  },
  logoutButton: {
    backgroundColor: '#E94560',
    marginHorizontal: 20,
    marginVertical: 20,
    padding: 15,
    borderRadius: 15,
    alignItems: 'center',
  },
  logoutText: {
    color: '#FFFFFF',
    fontSize: 16,
    fontWeight: '600',
  },
});

export default HomeScreen;

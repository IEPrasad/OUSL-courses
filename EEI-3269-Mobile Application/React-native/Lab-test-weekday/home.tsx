import React, { useState } from 'react';
import {
  View,
  Text,
  TouchableOpacity,
  StyleSheet,
  Image,
  SafeAreaView,
  ScrollView,
  TextInput,
  Switch,
} from 'react-native';

const EnergyDashboard = ({ navigation }) => {
  const [autoModeEnabled, setAutoModeEnabled] = useState(true);
  const [searchQuery, setSearchQuery] = useState('');

  const utilityMeters = [
    { id: '1', title: 'Electricity Meter', status: 'Active', reading: '450 kWh' },
    { id: '2', title: 'Water Meter', status: 'Active', reading: '120 Gallons' },
    { id: '3', title: 'Gas Meter', status: 'Inactive', reading: '80 CCF' },
    { id: '4', title: 'Solar Panel', status: 'Active', reading: '30 kWh' },
  ];

  return (
    <SafeAreaView style={styles.container}>
      {/* Header with User Profile */}
      <View style={styles.header}>
        <Image
          source={{ uri: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3flIHsvZtK3eU7tEnp-LSEjNznTZCn0dkcA&s' }}
          style={styles.profilePic}
        />
        <View style={styles.headerText}>
          <Text style={styles.nameText}>Welcome, J.V.G.I.E Prasad</Text>
          <Text style={styles.subText}>Total Energy Usage: 480 kWh</Text>
        </View>
      </View>

      <ScrollView style={styles.content}>
        {/* Quick Actions for Energy Management */}
        <View style={styles.section}>
          <Text style={styles.sectionTitle}>Quick Actions</Text>
          <View style={styles.quickActions}>
            <TouchableOpacity style={[styles.actionButton, styles.energyAction]}>
              <Text style={styles.actionText}>Usage Stats</Text>
            </TouchableOpacity>
            <TouchableOpacity style={[styles.actionButton, styles.energyAction]}>
              <Text style={styles.actionText}>Bills</Text>
            </TouchableOpacity>
            <TouchableOpacity style={[styles.actionButton, styles.energyAction]}>
              <Text style={styles.actionText}>Reports</Text>
            </TouchableOpacity>
          </View>
        </View>

        {/* Energy Usage Search */}
        <View style={styles.section}>
          <TextInput
            style={styles.searchInput}
            placeholder="Search appliances or utilities..."
            placeholderTextColor="#999"
            value={searchQuery}
            onChangeText={setSearchQuery}
          />
        </View>

        {/* Auto Mode Toggle */}
        <View style={styles.section}>
          <View style={styles.notificationRow}>
            <View>
              <Text style={styles.sectionTitle}>Smart Auto Mode</Text>
              <Text style={styles.subText}>Optimize energy usage automatically</Text>
            </View>
            <Switch
              value={autoModeEnabled}
              onValueChange={setAutoModeEnabled}
              trackColor={{ false: '#767577', true: '#4CAF50' }}
            />
          </View>
        </View>

        {/* Utility Meters Status */}
        <View style={styles.section}>
          <Text style={styles.sectionTitle}>Utility Meters</Text>
          {utilityMeters.map((meter) => (
            <TouchableOpacity key={meter.id} style={styles.meterItem}>
              <View>
                <Text style={styles.meterTitle}>{meter.title}</Text>
                <Text style={styles.meterReading}>{meter.reading}</Text>
              </View>
              <Text style={[
                styles.meterStatus,
                { color: meter.status === 'Active' ? '#4CAF50' : '#F44336' }
              ]}>
                {meter.status}
              </Text>
            </TouchableOpacity>
          ))}
        </View>

        {/* Emergency Shutdown Button */}
        <TouchableOpacity 
          style={styles.emergencyButton}
          onPress={() => alert('Emergency shutdown initiated')}
        >
          <Text style={styles.emergencyText}>Emergency Shutdown</Text>
        </TouchableOpacity>
      </ScrollView>
    </SafeAreaView>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#ffffff',
  },
  header: {
    padding: 20,
    flexDirection: 'row',
    alignItems: 'center',
    borderBottomWidth: 1,
    borderBottomColor: '#e0e0e0',
    backgroundColor: '#f8f9fa',
  },
  profilePic: {
    width: 50,
    height: 50,
    borderRadius: 25,
  },
  headerText: {
    marginLeft: 15,
    flex: 1,
  },
  nameText: {
    fontSize: 18,
    fontWeight: 'bold',
  },
  subText: {
    fontSize: 14,
    color: '#666',
    marginTop: 4,
  },
  content: {
    flex: 1,
  },
  section: {
    padding: 20,
    borderBottomWidth: 1,
    borderBottomColor: '#e0e0e0',
  },
  sectionTitle: {
    fontSize: 16,
    fontWeight: 'bold',
    marginBottom: 8,
  },
  quickActions: {
    flexDirection: 'row',
    justifyContent: 'space-between',
  },
  actionButton: {
    padding: 15,
    borderRadius: 8,
    flex: 1,
    marginHorizontal: 5,
  },
  energyAction: {
    backgroundColor: '#e3f2fd',
  },
  actionText: {
    textAlign: 'center',
    fontWeight: '500',
    color: '#1976d2',
  },
  searchInput: {
    backgroundColor: '#f5f5f5',
    padding: 15,
    borderRadius: 8,
    borderWidth: 1,
    borderColor: '#e0e0e0',
  },
  notificationRow: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
  },
  meterItem: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    paddingVertical: 15,
    borderBottomWidth: 1,
    borderBottomColor: '#e0e0e0',
  },
  meterTitle: {
    fontSize: 16,
    fontWeight: '500',
  },
  meterReading: {
    fontSize: 14,
    color: '#666',
    marginTop: 4,
  },
  meterStatus: {
    fontSize: 14,
    fontWeight: '500',
  },
  emergencyButton: {
    margin: 20,
    backgroundColor: '#ff4444',
    padding: 15,
    borderRadius: 8,
  },
  emergencyText: {
    color: 'white',
    textAlign: 'center',
    fontWeight: 'bold',
  },
});

export default EnergyDashboard;

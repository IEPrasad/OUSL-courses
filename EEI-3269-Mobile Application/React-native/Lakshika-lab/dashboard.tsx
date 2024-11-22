import React from 'react';
import { View, Text, StyleSheet, Switch, TouchableOpacity } from 'react-native'
import { useRouter } from 'expo-router';

export default function Dashboard() {
  const [isMeterOn, setIsMeterOn] = React.useState(false);
  const router = useRouter();

  return (
    <View style={styles.container}>
      {/* Header */}
      <View style={styles.header}>
        <Text style={styles.greeting}>Good Morning,</Text>
        <Text style={styles.name}>John!</Text>
      </View>

      {/* Saved Energy Section */}
      <View style={styles.savedSection}>
        <Text style={styles.savedText}>7kW</Text>
        <Text style={styles.subText}>Saved this month</Text>
        <Switch
          value={isMeterOn}
          onValueChange={setIsMeterOn}
          style={styles.switch}
        />
        <Text style={styles.switchLabel}>
          {isMeterOn ? 'Turn meter ON' : 'Turn meter OFF'}
        </Text>
      </View>

      <View style={styles.usageSection}>
        <View style={styles.usageRow}>
          <Text style={styles.usageText}>Today</Text>
          <Text style={styles.usageValue}>17.92kWh</Text>
        </View>
        <View style={styles.usageRow}>
          <Text style={styles.usageText}>Week</Text>
          <Text style={styles.usageValue}>74.31kWh</Text>
        </View>
        <View style={styles.usageRow}>
          <Text style={styles.usageText}>Month</Text>
          <Text style={styles.usageValue}>548.5kWh</Text>
        </View>
      </View>

      <View style={styles.pieChartSection}>
        <View style={styles.chartDetails}>
          <Text style={styles.chartText}>Refrigerator: 8.3kWh</Text>
          <Text style={styles.chartText}>TV: 3.5kWh</Text>
          <Text style={styles.chartText}>Air Conditioner: 6.12kWh</Text>
        </View>
      </View>

      {/* Footer Navigation */}
      <View style={styles.footer}>
        <TouchableOpacity onPress={() => router.push('/(tabs)/dashboard')}>
          <Text style={styles.footerText}>Dashboard</Text>
        </TouchableOpacity>
        <TouchableOpacity onPress={() => router.push('/(tabs)/energy')}>
          <Text style={styles.footerText}>⚡</Text>
        </TouchableOpacity>
        <TouchableOpacity onPress={() => router.push('/(tabs)/notifications')}>
          <Text style={styles.footerText}>🔔</Text>
        </TouchableOpacity>
      </View>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    padding: 20,
    backgroundColor: '#fff',
  },
  header: {
    marginBottom: 20,
  },
  greeting: {
    fontSize: 18,
    color: '#333',
  },
  name: {
    fontSize: 24,
    fontWeight: 'bold',
    color: '#000',
  },
  savedSection: {
    alignItems: 'center',
    marginBottom: 20,
  },
  savedText: {
    fontSize: 36,
    fontWeight: 'bold',
    color: '#000',
  },
  subText: {
    fontSize: 14,
    color: '#555',
  },
  switch: {
    marginTop: 10,
  },
  switchLabel: {
    fontSize: 14,
    color: '#555',
  },
  usageSection: {
    marginBottom: 20,
  },
  usageRow: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    marginBottom: 5,
  },
  usageText: {
    fontSize: 16,
    color: '#333',
  },
  usageValue: {
    fontSize: 16,
    fontWeight: 'bold',
    color: '#000',
  },
  pieChartSection: {
    alignItems: 'center',
    marginBottom: 20,
  },
  chartDetails: {
    alignItems: 'flex-start',
  },
  chartText: {
    fontSize: 14,
    color: '#333',
  },
  footer: {
    flexDirection: 'row',
    justifyContent: 'space-around',
    paddingVertical: 10,
    borderTopWidth: 1,
    borderColor: '#ddd',
  },
  footerText: {
    fontSize: 16,
    color: '#333',
  },
});

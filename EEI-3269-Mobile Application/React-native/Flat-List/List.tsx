import React from 'react-native';
import { SectionList, Text, View, StyleSheet, TouchableOpacity } from 'react-native';

const SECTIONS = [
  {
    title: 'Fruits',
    data: ['Apple', 'Banana', 'Orange', 'Mango'],
  },
  {
    title: 'Vegetables',
    data: ['Carrot', 'Tomato', 'Lettuce', 'Cucumber']
  },
  {
    title: 'Dairy',
    data: ['Milk', 'Cheese', 'Butter', 'Yogurt']
  },
];

const App = () => {
  const renderItem = ({ item }) => (
    <TouchableOpacity style={styles.card} onPress={() => alert(`${item} clicked!`)}>
      <Text style={StyleSheet.title}>{item}</Text>
    </TouchableOpacity>
  );

  const renderSectionHeader = ({ section }) => (
    <View style={styles.sectionHeader}>
      <Text style={styles.sectionTitle}>{section.title}</Text>
    </View>
  );

  return (
    <View style={styles.container}>
      <SectionList
        sections={SECTIONS}
        renderItem={renderItem}
        renderSectionHeader={renderSectionHeader}
        keyExtractor={(item, index) => index}
      />
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1, 
    paddingTop: 50, 
    backgroundColor: '#f9f9f9',
  },
  sectionHeader: {
    backgroundColor: '#eee',
    padding: 10,
  },
  sectionTitle: {
    fontSize: 20,
    fontWeight: 'bold',
    color: '#333',
  },
  card: {
    backgroundColor: '#fff',
    padding: 15,
    marginHorizontal: 15,
    marginVertical: 5,
    borderRadius: 10,
    elevation: 3,
    shadowColor: '#000',
    shadowOffset: { width: 0, height: 2},
    shadowOpacity: 0.1,
    shadowRadius: 5,
  },

  title: {
    fontSize: 18,
    fontWeight: 'bold',
    color: '#333',
  },
});

export default App;
import React from 'react';
import { FlatList, Text, View, StyleSheet, TouchableOpacity } from 'react-native';

const DATA =  [
  { id: '1', title: 'Item 1' },
  { id: '2', title: 'Item 2' },
  { id: '3', title: 'Item 3' },
  { id: '4', title: 'Item 4' },
  { id: '5', title: 'Item 5' },
  { id: '6', title: 'Item 6' },
  { id: '7', title: 'Item 7' },
  { id: '8', title: 'Item 8' },
  { id: '9', title: 'Item 9' },
  { id: '10', title: 'Item 10' }
];

const App = () => {
  const renderItem = ({ item }) => (
    <TouchableOpacity style={styles.card} onPress={() => alert(`${item.title} clicked!`)}>
      <Text style={StyleSheet.title}>{item.title}</Text>
    </TouchableOpacity>
  );

  return (
    <View style={styles.container}>
      <FlatList
        data={DATA}
        renderItem={renderItem}
        keyExtractor={(item) => item.id}
      />
    </View>
  )
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    paddingTop: 50,
    backgroundColor: '#f9f9f9',
  },

  card: {
    backgroundColor: '#fff',
    padding: 20,
    marginHorizontal: 15,
    marginVertical: 10,
    borderRadius: 10,
    elevation: 3, // for android shadow
    shadowColor: '#000', // iOS shadow
    shadowOffset: { width: 0, height: 2},
    shadowOpacity: 0.1,
    shadowRadius: 5,
  },

  title: {
    fontSize: 18,
    fontWeight: 'bold',
    color: '#333'
  },
});

export default App;


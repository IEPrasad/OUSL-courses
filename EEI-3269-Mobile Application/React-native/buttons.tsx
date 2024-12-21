import { StatusBar } from 'expo-status-bar';
import {
  StyleSheet,
  Text,
  View,
  TextInput,
  TouchableOpacity,
  Image
} from 'react-native';

export default function App() {
  return (
    <View style = {styles.container}>

      <View style = {styles.buttonContainer}>
        <TouchableOpacity style={styles.userButton}>
          <Text
          style={styles.buttonText}>Login</Text>
        </TouchableOpacity>
      </View>
      <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '8#b8c81',
    alignItems: 'center',
    justifyContent: 'center',
  },

  userButton: {
    backgroundColor: '#FFD700',
    padding: 15,
    width: "100 %"
  },

  buttonText: {
    fontSize: 18,
    textAlign: 'center',
  },

  buttonContainer: {
    flexDirection: 'row',
    width: "90%"
  }

});
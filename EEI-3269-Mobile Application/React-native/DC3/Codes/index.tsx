// App.tsx
import React, { useState } from 'react';
import { View, Text, TextInput, TouchableOpacity, StyleSheet, Image, Alert } from 'react-native';
import * as ImagePicker from 'expo-image-picker';

export default function App() {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const [profileImage, setProfileImage] = useState<string | null>(null);

  // Function to handle image selection
  const pickImage = async () => {
    // Request permission to access media library
    const permissionResult = await ImagePicker.requestMediaLibraryPermissionsAsync();

    if (permissionResult.granted === false) {
      Alert.alert('Permission to access camera roll is required!');
      return;
    }

    // Launch the image picker
    const result = await ImagePicker.launchImageLibraryAsync({
      mediaTypes: ImagePicker.MediaTypeOptions.Images,
      allowsEditing: true,
      aspect: [4, 3],
      quality: 1,
    });

    if (result.cancelled === true) {
      return;
    }

    // Set the selected image
    setProfileImage(result.uri);
  };

  return (
    <View style={styles.container}>
      {/* Header with Eazy Shopping */}
      <Text style={styles.headerText}>Eazy Shopping</Text>

      {/* Profile Image Selector */}
      <TouchableOpacity onPress={pickImage} style={styles.logoContainer}>
        {profileImage ? (
          <Image style={styles.logo} source={{ uri: profileImage }} />
        ) : (
          <Text style={styles.logoText}>Select Profile Image</Text>
        )}
      </TouchableOpacity>

      {/* Username Input */}
      <TextInput
        style={styles.input}
        placeholder="Username"
        placeholderTextColor="#000"
        value={username}
        onChangeText={setUsername}
      />

      {/* Password Input */}
      <TextInput
        style={styles.input}
        placeholder="Password"
        placeholderTextColor="#000"
        secureTextEntry
        value={password}
        onChangeText={setPassword}
      />

      {/* Login Button */}
      <TouchableOpacity style={styles.button}>
        <Text style={styles.buttonText}>Login</Text>
      </TouchableOpacity>

      {/* Signup Button */}
      <TouchableOpacity style={styles.signupButton}>
        <Text style={styles.signupButtonText}>Signup</Text>
      </TouchableOpacity>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#A1CEDC', // Light blue background as per the design
    alignItems: 'center',
    justifyContent: 'center',
    padding: 20,
  },
  headerText: {
    fontSize: 28,
    fontWeight: 'bold',
    marginBottom: 20,
    color: '#000',
  },
  logoContainer: {
    backgroundColor: '#006080', // Darker blue background for the logo
    borderRadius: 100,
    marginBottom: 40,
    alignItems: 'center',
    justifyContent: 'center',
    width: 100,
    height: 100,
  },
  logo: {
    width: 100,
    height: 100,
    borderRadius: 50,
  },
  logoText: {
    color: '#fff',
    fontWeight: 'bold',
  },
  input: {
    width: '100%',
    height: 50,
    borderColor: '#000',
    borderWidth: 2,
    marginBottom: 20,
    paddingHorizontal: 10,
    backgroundColor: '#fff',
    borderRadius: 5,
  },
  button: {
    width: '100%',
    height: 50,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
    borderRadius: 5,
    marginVertical: 10,
    borderColor: '#000',
    borderWidth: 2,
  },
  buttonText: {
    fontSize: 18,
    color: '#000',
    fontWeight: 'bold',
  },
  signupButton: {
    width: '100%',
    height: 50,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
    borderRadius: 5,
    marginVertical: 10,
    borderColor: '#000',
    borderWidth: 2,
  },
  signupButtonText: {
    fontSize: 18,
    color: '#000',
    fontWeight: 'bold',
  },
});

import React, { useState } from 'react';
import {
  View,
  Text,
  TextInput,
  TouchableOpacity,
  StyleSheet,
  SafeAreaView,
  KeyboardAvoidingView,
  Platform,
  TouchableWithoutFeedback,
  Keyboard,
  Image,
  ScrollView,
} from 'react-native';
import { useRouter } from 'expo-router';

const SignupScreen = () => {
  const router = useRouter();
  const [formData, setFormData] = useState({
    fullName: '',
    email: '',
    password: '',
    confirmPassword: '',
    propertyType: '',
    meterNumber: '',
  });
  const [error, setError] = useState('');

  const handleSignup = () => {
    // Basic validation
    if (!formData.fullName || !formData.email || !formData.password || 
        !formData.confirmPassword || !formData.propertyType || !formData.meterNumber) {
      setError('Please fill in all fields');
      return;
    }
    if (formData.password !== formData.confirmPassword) {
      setError('Passwords do not match');
      return;
    }
    if (formData.meterNumber.length < 6) {
      setError('Please enter a valid meter number');
      return;
    }
    
    // Here you would typically make an API call to register the user
    router.push('/home');
  };

  return (
    <SafeAreaView style={styles.container}>
      <KeyboardAvoidingView
        behavior={Platform.OS === 'ios' ? 'padding' : 'height'}
        style={styles.keyboardAvoidingView}
      >
        <TouchableWithoutFeedback onPress={Keyboard.dismiss}>
          <View style={styles.inner}>
            {/* Header with back button */}
            <View style={styles.header}>
              <TouchableOpacity 
                style={styles.backButton}
                onPress={() => router.back()}
              >
                <Text style={styles.backButtonText}>Back</Text>
              </TouchableOpacity>
            </View>

            <ScrollView 
              style={styles.scrollView}
              showsVerticalScrollIndicator={false}
              contentContainerStyle={styles.scrollViewContent}
            >
              <View style={styles.mainContainer}>
                <Text style={styles.title}>Create Account</Text>
                <Text style={styles.subtitle}>
                  Sign up to monitor and manage your utility consumption
                </Text>

                {error ? <Text style={styles.errorText}>{error}</Text> : null}

                {/* Form */}
                <View style={styles.formContainer}>
                  <View style={styles.inputContainer}>
                    <Image
                      source={{ uri: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSd0b3jR4MAO5Mgel2UcuVcAmph9KD3EuUjZQ&s' }}
                      style={styles.inputIcon}
                    />
                    <TextInput
                      style={styles.input}
                      placeholder="Full Name"
                      placeholderTextColor="#666666"
                      value={formData.fullName}
                      onChangeText={(text) => setFormData({...formData, fullName: text})}
                      autoCapitalize="words"
                    />
                  </View>

                  <View style={styles.inputContainer}>
                    <Image
                      source={{ uri: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSd0b3jR4MAO5Mgel2UcuVcAmph9KD3EuUjZQ&s' }}
                      style={styles.inputIcon}
                    />
                    <TextInput
                      style={styles.input}
                      placeholder="Email"
                      placeholderTextColor="#666666"
                      value={formData.email}
                      onChangeText={(text) => setFormData({...formData, email: text})}
                      keyboardType="email-address"
                      autoCapitalize="none"
                    />
                  </View>

                  <View style={styles.inputContainer}>
                    <TextInput
                      style={styles.input}
                      placeholder="Property Type (Residential/Commercial)"
                      placeholderTextColor="#666666"
                      value={formData.propertyType}
                      onChangeText={(text) => setFormData({...formData, propertyType: text})}
                    />
                  </View>

                  <View style={styles.inputContainer}>
                    <TextInput
                      style={styles.input}
                      placeholder="Utility Meter Number"
                      placeholderTextColor="#666666"
                      value={formData.meterNumber}
                      onChangeText={(text) => setFormData({...formData, meterNumber: text})}
                      keyboardType="numeric"
                    />
                  </View>

                  <View style={styles.inputContainer}>
                    <TextInput
                      style={styles.input}
                      placeholder="Password"
                      placeholderTextColor="#666666"
                      value={formData.password}
                      onChangeText={(text) => setFormData({...formData, password: text})}
                      secureTextEntry
                      autoCapitalize="none"
                    />
                  </View>

                  <View style={styles.inputContainer}>
                    <TextInput
                      style={styles.input}
                      placeholder="Confirm Password"
                      placeholderTextColor="#666666"
                      value={formData.confirmPassword}
                      onChangeText={(text) => setFormData({...formData, confirmPassword: text})}
                      secureTextEntry
                      autoCapitalize="none"
                    />
                  </View>
                </View>

                <TouchableOpacity 
                  style={styles.signupButton}
                  onPress={handleSignup}
                >
                  <Text style={styles.signupButtonText}>Create Account</Text>
                </TouchableOpacity>

                <View style={styles.loginContainer}>
                  <Text style={styles.loginText}>Already have an account? </Text>
                  <TouchableOpacity onPress={() => router.push('/home')}>
                    <Text style={styles.loginLink}>Log In</Text>
                  </TouchableOpacity>
                </View>
              </View>
            </ScrollView>
          </View>
        </TouchableWithoutFeedback>
      </KeyboardAvoidingView>
    </SafeAreaView>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#121212',
  },
  keyboardAvoidingView: {
    flex: 1,
  },
  inner: {
    flex: 1,
  },
  scrollView: {
    flex: 1,
  },
  scrollViewContent: {
    flexGrow: 1,
  },
  header: {
    flexDirection: 'row',
    alignItems: 'center',
    padding: 20,
    backgroundColor: '#121212',
  },
  backButton: {
    flexDirection: 'row',
    alignItems: 'center',
  },
  backButtonText: {
    fontSize: 16,
    color: '#2196F3',
  },
  mainContainer: {
    flex: 1,
    padding: 24,
  },
  title: {
    fontSize: 28,
    fontWeight: 'bold',
    color: '#ffffff',
    marginBottom: 8,
  },
  subtitle: {
    fontSize: 16,
    color: '#B3B3B3',
    marginBottom: 32,
  },
  formContainer: {
    marginBottom: 24,
  },
  inputContainer: {
    flexDirection: 'row',
    alignItems: 'center',
    backgroundColor: '#1E1E1E',
    borderRadius: 10,
    marginBottom: 16,
    paddingHorizontal: 15,
    borderWidth: 1,
    borderColor: '#333333',
  },
  inputIcon: {
    width: 20,
    height: 20,
    marginRight: 10,
  },
  input: {
    flex: 1,
    padding: 15,
    fontSize: 16,
    color: '#ffffff',
  },
  errorText: {
    color: '#FF4444',
    marginBottom: 16,
    textAlign: 'center',
  },
  signupButton: {
    backgroundColor: '#2196F3',
    padding: 15,
    borderRadius: 10,
    alignItems: 'center',
    elevation: 3,
    shadowColor: '#2196F3',
    shadowOffset: { width: 0, height: 2 },
    shadowOpacity: 0.25,
    shadowRadius: 3.84,
  },
  signupButtonText: {
    color: '#ffffff',
    fontSize: 16,
    fontWeight: '600',
  },
  loginContainer: {
    flexDirection: 'row',
    justifyContent: 'center',
    marginTop: 32,
    marginBottom: 20,
    alignItems: 'center',
  },
  loginText: {
    color: '#B3B3B3',
    fontSize: 16,
  },
  loginLink: {
    color: '#2196F3',
    fontSize: 16,
    fontWeight: '600',
  },
});

export default SignupScreen;

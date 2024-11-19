import React, { useState } from 'react';
import {
  View,
  Text,
  TextInput,
  TouchableOpacity,
  StyleSheet,
  SafeAreaView,
  Image,
  KeyboardAvoidingView,
  Platform,
  ScrollView,
} from 'react-native';
import { useRouter } from 'expo-router'; // Add this import

const LoginScreen = () => {
  const router = useRouter(); // Add this line
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [error, setError] = useState('');

  const handleLogin = () => {
    if (!email || !password) {
      setError('Please fill in all fields');
      return;
    }
    setError('');
    router.push('/home'); // Changed from navigation.navigate
  };

  return (
    <SafeAreaView style={styles.container}>
      <KeyboardAvoidingView 
        behavior={Platform.OS === 'ios' ? 'padding' : 'height'}
        style={styles.keyboardAvoid}
      >
        <ScrollView contentContainerStyle={styles.scrollContent}>
          {/* Logo Section */}
          <View style={styles.logoContainer}>
            <View style={styles.logoBackground}>
              <Image
                source={{ uri: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3flIHsvZtK3eU7tEnp-LSEjNznTZCn0dkcA&s' }}
                style={styles.logo}
              />
            </View>
            <Text style={styles.appName}>EnergyWatch Pro</Text>
            <Text style={styles.appTagline}>Smart Energy Management Solution</Text>
          </View>

          {/* Form Section */}
          <View style={styles.formContainer}>
            <Text style={styles.welcomeText}>Welcome to EnergyWatch</Text>
            <Text style={styles.subText}>Monitor and manage your utility usage</Text>
            
            {error ? <Text style={styles.errorText}>{error}</Text> : null}

            <TextInput
              style={styles.input}
              placeholder="Email or Account ID"
              placeholderTextColor="#607D8B"
              value={email}
              onChangeText={setEmail}
              keyboardType="email-address"
              autoCapitalize="none"
            />

            <TextInput
              style={styles.input}
              placeholder="Password"
              placeholderTextColor="#607D8B"
              value={password}
              onChangeText={setPassword}
              secureTextEntry
              autoCapitalize="none"
            />

            <TouchableOpacity 
              onPress={() => router.push('/login')} // Changed from navigation.navigate
              style={styles.forgotPassword} 
            >
              <Text style={styles.forgotPasswordText}>Forgot Password?</Text>
            </TouchableOpacity>

            <TouchableOpacity 
              style={styles.loginButton}
              onPress={handleLogin}
            >
              <Text style={styles.loginButtonText}>Access Dashboard</Text>
            </TouchableOpacity>

            <View style={styles.signupContainer}>
              <Text style={styles.signupText}>New to EnergyWatch? </Text>
              <TouchableOpacity onPress={() => router.push('/signup')}>
                <Text style={styles.signupLink}>Create Account</Text>
              </TouchableOpacity>
            </View>
          </View>
        </ScrollView>
      </KeyboardAvoidingView>
    </SafeAreaView>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#F5F7FA',
  },
  keyboardAvoid: {
    flex: 1,
  },
  scrollContent: {
    flexGrow: 1,
    padding: 20,
    justifyContent: 'center',
  },
  logoContainer: {
    alignItems: 'center',
    marginBottom: 40,
  },
  logoBackground: {
    backgroundColor: '#E1F5FE',
    padding: 20,
    borderRadius: 75,
    marginBottom: 15,
  },
  logo: {
    width: 100,
    height: 100,
    borderRadius: 50,
  },
  appName: {
    fontSize: 28,
    fontWeight: 'bold',
    color: '#0D47A1',
    marginBottom: 5,
  },
  appTagline: {
    fontSize: 16,
    color: '#546E7A',
    textAlign: 'center',
  },
  formContainer: {
    width: '100%',
    backgroundColor: '#ffffff',
    padding: 25,
    borderRadius: 15,
    shadowColor: '#000',
    shadowOffset: {
      width: 0,
      height: 2,
    },
    shadowOpacity: 0.1,
    shadowRadius: 8,
    elevation: 5,
  },
  welcomeText: {
    fontSize: 24,
    fontWeight: 'bold',
    color: '#1976D2',
    marginBottom: 8,
    textAlign: 'center',
  },
  subText: {
    fontSize: 14,
    color: '#78909C',
    marginBottom: 20,
    textAlign: 'center',
  },
  errorText: {
    color: '#F44336',
    marginBottom: 10,
    textAlign: 'center',
  },
  input: {
    backgroundColor: '#F8F9FA',
    padding: 15,
    borderRadius: 10,
    marginBottom: 15,
    fontSize: 16,
    borderWidth: 1,
    borderColor: '#E0E0E0',
  },
  forgotPassword: {
    alignSelf: 'flex-end',
    marginBottom: 20,
  },
  forgotPasswordText: {
    color: '#1976D2',
    fontSize: 14,
  },
  loginButton: {
    backgroundColor: '#2196F3',
    padding: 16,
    borderRadius: 10,
    alignItems: 'center',
    shadowColor: '#000',
    shadowOffset: {
      width: 0,
      height: 2,
    },
    shadowOpacity: 0.1,
    shadowRadius: 4,
    elevation: 3,
  },
  loginButtonText: {
    color: '#ffffff',
    fontSize: 16,
    fontWeight: 'bold',
  },
  signupContainer: {
    flexDirection: 'row',
    justifyContent: 'center',
    marginTop: 20,
  },
  signupText: {
    color: '#78909C',
  },
  signupLink: {
    color: '#1976D2',
    fontWeight: 'bold',
  },
});

export default LoginScreen;

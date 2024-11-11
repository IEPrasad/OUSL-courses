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
  Dimensions,
  ScrollView,
} from 'react-native';
import { useRouter } from 'expo-router';

const { width } = Dimensions.get('window');

const SignupScreen = () => {
  const router = useRouter();
  const [fullName, setFullName] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const [confirmPassword, setConfirmPassword] = useState('');
  const [error, setError] = useState('');

  const handleSignup = () => {
    if (!fullName || !email || !password || !confirmPassword) {
      setError('Please fill in all fields');
      return;
    }
    if (password !== confirmPassword) {
      setError('Passwords do not match');
      return;
    }
    setError('');
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
            {/* Header with back button and decorative image */}
            <View style={styles.header}>
              <TouchableOpacity 
                style={styles.backButton}
                onPress={() => router.back()}
              >
                {/* <Image
                  // source={{ uri: 'https://via.placeholder.com/24' }}
                  style={styles.backIcon}
                /> */}
                <Text style={styles.backButtonText}>Back</Text>
              </TouchableOpacity>
              <Image
                source={{ uri: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQS10CLHLV36UQ1gsvVnZ4ndIL-Z_RPQKsSSQ&s' }}
                style={styles.headerImage}
              />
            </View>

            <ScrollView 
              style={styles.scrollView}
              showsVerticalScrollIndicator={false}
              contentContainerStyle={styles.scrollViewContent}
            >
              {/* Main Content Container */}
              <View style={styles.mainContainer}>
                <Text style={styles.title}>Create Account</Text>
                <Text style={styles.subtitle}>Sign up to get started</Text>

                {/* Profile Picture Section */}
                <View style={styles.profilePicContainer}>
                  <View style={styles.profilePicWrapper}>
                    <Image
                      source={{ uri: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS6Hb5xzFZJCTW4cMqmPwsgfw-gILUV7QevvQ&s' }}
                      style={styles.profilePic}
                    />
                    <View style={styles.cameraIconContainer}>
                      <Image
                        source={{ uri: 'data:image/png;base64,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' }}
                        style={styles.cameraIcon}
                      />
                    </View>
                  </View>
                  <Text style={styles.addPhotoText}>Add Profile Photo</Text>
                </View>

                {error ? <Text style={styles.errorText}>{error}</Text> : null}

                {/* Form */}
                <View style={styles.formContainer}>
                  <View style={styles.inputContainer}>
                    <Image
                      source={{ uri: 'data:image/png;base64,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' }}
                      style={styles.inputIcon}
                    />
                    <TextInput
                      style={styles.input}
                      placeholder="Full Name"
                      placeholderTextColor="#666666"
                      value={fullName}
                      onChangeText={setFullName}
                      autoCorrect={false}
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
                      value={email}
                      onChangeText={setEmail}
                      keyboardType="email-address"
                      autoCapitalize="none"
                      autoCorrect={false}
                    />
                  </View>

                  <View style={styles.inputContainer}>
                    <Image
                      source={{ uri: 'data:image/png;base64,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' }}
                      style={styles.inputIcon}
                    />
                    <TextInput
                      style={styles.input}
                      placeholder="Password"
                      placeholderTextColor="#666666"
                      value={password}
                      onChangeText={setPassword}
                      secureTextEntry
                      autoCapitalize="none"
                    />
                  </View>

                  <View style={styles.inputContainer}>
                    <Image
                      source={{ uri: 'data:image/png;base64,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' }}
                      style={styles.inputIcon}
                    />
                    <TextInput
                      style={styles.input}
                      placeholder="Confirm Password"
                      placeholderTextColor="#666666"
                      value={confirmPassword}
                      onChangeText={setConfirmPassword}
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

                {/* Social Signup Options */}
                <View style={styles.socialContainer}>
                  <View style={styles.dividerContainer}>
                    <View style={styles.divider} />
                    <Text style={styles.dividerText}>or sign up with</Text>
                    <View style={styles.divider} />
                  </View>

                  <View style={styles.socialButtons}>
                    <TouchableOpacity style={styles.socialButton}>
                      <Image
                        source={{ uri: 'data:image/png;base64,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' }}
                        style={styles.socialIcon}
                      />
                    </TouchableOpacity>
                    <TouchableOpacity style={styles.socialButton}>
                      <Image
                        source={{ uri: 'data:image/jpeg;base64,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' }}
                        style={styles.socialIcon}
                      />
                    </TouchableOpacity>
                  </View>
                </View>

                <View style={styles.loginContainer}>
                  <Text style={styles.loginText}>Already have an account? </Text>
                  <TouchableOpacity onPress={() => router.push('/login')}>
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
    justifyContent: 'space-between',
    alignItems: 'center',
    padding: 20,
    backgroundColor: '#121212',
  },
  backButton: {
    flexDirection: 'row',
    alignItems: 'center',
  },
  backIcon: {
    width: 24,
    height: 24,
    marginRight: 8,
    tintColor: '#2196F3', 
  },
  backButtonText: {
    fontSize: 16,
    color: '#2196F3', 
  },
  headerImage: {
    width: 50,
    height: 50,
    borderRadius: 25,
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
  profilePicContainer: {
    alignItems: 'center',
    marginBottom: 32,
  },
  profilePicWrapper: {
    position: 'relative',
  },
  profilePic: {
    width: 120,
    height: 120,
    borderRadius: 60,
    borderWidth: 3,
    borderColor: '#2196F3',
  },
  cameraIconContainer: {
    position: 'absolute',
    bottom: 0,
    right: 0,
    backgroundColor: '#2196F3', 
    width: 36,
    height: 36,
    borderRadius: 18,
    justifyContent: 'center',
    alignItems: 'center',
    borderWidth: 3,
    borderColor: '#121212',
  },
  cameraIcon: {
    width: 30,
    height: 30,
    borderRadius: 18,
    // tintColor: '#FFFFFF',
  },
  addPhotoText: {
    color: '#2196F3', 
    fontSize: 16,
    marginTop: 12,
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
    // tintColor: '#666666',
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
  socialContainer: {
    marginTop: 32,
  },
  dividerContainer: {
    flexDirection: 'row',
    alignItems: 'center',
    marginBottom: 20,
  },
  divider: {
    flex: 1,
    height: 1,
    backgroundColor: '#333333',
  },
  dividerText: {
    color: '#B3B3B3', 
    paddingHorizontal: 10,
  },
  socialButtons: {
    flexDirection: 'row',
    justifyContent: 'center',
    gap: 20,
  },
  socialButton: {
    width: 50,
    height: 50,
    borderRadius: 25,
    backgroundColor: '#1E1E1E', 
    justifyContent: 'center',
    alignItems: 'center',
    borderWidth: 1,
    borderColor: '#333333',
  },
  socialIcon: {
    width: 40,
    height: 40,
    borderRadius: 40,
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

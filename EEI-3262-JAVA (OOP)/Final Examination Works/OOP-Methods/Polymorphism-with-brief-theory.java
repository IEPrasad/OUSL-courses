Polymorphism (Brief Theory)

  ** Polymorphism means "many forms." It allows object to be treated as instances of their parent class, even if they belong to different child classes. 
  It's a key OOP concept enabling method overriding and method 
  overloading.'

  ** Types of Polymorphism:

    1. Compile-time Polymorphism (Method Overloading):
      * Same method name, different parameters.
      * Resolved at compile time 
    
    2. Runtime Polymorphism (Method Overriding):
      * A child class provides its own implementation of a parent 
      class method. 
      * Resolved at runtime.

Example 

  1. Compile-time Polymorphism (Overloading)

  class Calculator {
    // Overloaded methods
    public int add(int a, it b) {
      return a + b;
    }

    public double add(double a, double b) {
      return a + b;
    }
  }

  public class OverloadingExample {
    public static void main(String[] args) {
      Calculator calc = new Calculator();
      System.out.println("Integer Addition: " + calc.add(5, 10));
      System.out.println("Double Addition: " + calc.add(5.5 + 10.5));
    }
  }

// >>> Output 

  Integer Addition: 15 
  Double Addition: 16.0

// --------------

 2. Runtime Polymorphism (Overriding)

 // Parent Class 
  class Animal {
    public void sound() {
      System.out.println("Animal makes a sound.");
    } 
  }

  // Child Class 1 
  class Dog extends Animal {
    @Override 
    public void sound() {
      System.out.println("Dog barks.");
    }
  }

  // Child Class 2
  class Cat extends Animal {
    @Override 
    public void sound() {
      System.out.println("Cat meows.");
    }
  }

  // Main Class 
  public class OverridingExample {
    public static void main(String[] args) {
      // Parent reference, child objects
      Animal myDog = new Dog();
      Animal myCat = new Cat();
      Animal animal = new Animal();
      // Method calls
      myDog.sound();  // Dog't sound method
      myCat.sound();  // Cat's sound method
      animal.sound();  // call the parent class method
    }
  }

// >>> Output
  // Dog barks.
  // Cat meows.
  // Animal makes a sound.
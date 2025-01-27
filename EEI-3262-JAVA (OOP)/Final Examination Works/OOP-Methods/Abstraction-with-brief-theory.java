Abstraction in Java (Brief Theory)

Definition 

  ** Abstraction is an OOP concept where we hide unnecessary details and only show essential 
  features of an object. It helps focus on what an object does instead of how it does it.

Key Points:

  1. Abstract Classes:
    ** Declared with the abstract keyword.
    ** Can have both abstract methods (methods without a body) and concrete methods (methods with a body).
    ** Cannot be instantiated directly.

  2. Interfaces:

    ** Provide 100% abstraction (prior to Java 8). 
    After Java 8, interfaces can also have default methods and static methods.

    ** Declared using the interface keyword.

    ** A class can implement multiple interfaces, supporting multiple inheritance.

Example
  1. Using Abstract Class 

  abstract class Vehicle {
    abstract void start();  // Abstract method

    public void fuelType() {  // Concrete method
      System.out.println("Uses fuel to run.");
    }
  }

  // Child class 1 
  class Car extends Vehicle {
    @Override 
    void start() {
      System.out.println("Bike starts with a button.");
    }
  }

  public class AbstractionExample {
    public static void main(String[] args) {
      Vehicle car = new Car();
      Vehicle bike = new Bike();

      car.start();  // Calls Car's implementation
      car.fuelType();
      bike.start();  // Calls Bike's implementation
      bike.fuelType();
    }
  }

// >>> Output

  // Car starts with a key.
  // Uses fuel to run.
  // Bike starts with a button.
  // Uses fuel to run

--- 

  2. Using Interface 

  // Interface 
  interface Animal {
    void sound(); // Abstract method
  }

  // Class implementing the interface 
  class Dog implements Animal {
    @Override 
    public void sound() {
      System.out.println("Dog barks.");
    }
  }

  // Another class implementing the interface
  class Cat implements Animal {
    @Override
    public void sound() {
      System.out.println("Cat meows.");
    }
  }

  public class InterfaceExample {
    public static void main(String[] args) {
      Animal dog = new Dog();
      Animal cat = new Cat();

      dog.sound();  // Dog's implementation
      cat.sound();  // Cat's implementation
    }
  }

// >>> Output
  // Dog barks.
  // Cat meows.

---

When to Use Abstraction:

  ** Abstract Classes: Use when classes share a common base but require different implementation
  for some methods. 

  ** Interface: Use when you need to define a contract that multiple classes can follow, 
  supporting multiple inheritance.

          --- 
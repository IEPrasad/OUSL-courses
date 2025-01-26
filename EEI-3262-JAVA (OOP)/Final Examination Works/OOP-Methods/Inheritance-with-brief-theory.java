Inheritance (Brief Theory) 

  ** Inheritance is an OOP concept where one class (child class) inherits properties and methods from another class (parent class).

  ** It allows code reuse and support hierarchical relationship.

  Key Points 
    1. Use the extends keyword to inherit from a parent class. 
    2. The child class can access public and protected of the parent class.
    3. The child class can override methods of the parent for specific behavior (Polymorphism).

Example 

  // Parent class 
  class Animal {
    private String name;

    // Constructor 
    public Animal(String name) {
      this.name = name;
    }

    // Method 
    public void eat() {
      System.out.println(name + " is eating.");
    }

    // Getter 
    public String getName() {
      return name;
    }
  }

  // Child Class 

  class Dog extends Animal {
    private String breed;

    // Constructor 
    public Dog(String name, String breed) {
      super(name);  // Calling parent class constructor
      this.breed = breed;
    }

    // Method specific to Dog
    public void bark() {
      System.out.println(getName() + " is barking.");
    }

    // Overriding Parent Method
    @Override 
    public void eat() {
      System.out.println(getName() + " (a " + breed + ") is eating dog food.");
    }
  }

  // Main Class 
  public class InheritanceExample {
    public static void main(String[] args) {
      // Creating a Dog object 
      Dog dog = new Dog("Buddy", "Golden Retriever");

      // Using methods 
      dog.eat();  // OVerridden method 
      dog.bark(); // Specific to Dog 
    }
  }

Output 

  Buddy (a Golden Retriever) is eating dog food.
  Buddy is barking.

    ---
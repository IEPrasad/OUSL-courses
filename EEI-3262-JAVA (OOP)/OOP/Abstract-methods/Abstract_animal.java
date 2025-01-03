** Theory of Abstract in Java 

  1. Definition:
    ** Abstract classes in Java are classes that cannot be instantiated but can be subclassed.

  2. Purpose:
    ** Used to define common properties and methods that must be implemented by subclasses.

  3. Abstract Methods:
    ** Declared without a body using the abstract keyword.

    ** Must be implemented by derived classes.

  4. Concrete Methods:
    ** Abstract classes can also have regular methods with full implementation.

  5. Usage:
    ** Declare an abstract class using the abstract keyword.

    ** Useful for achieving partial abstraction and enforcing a contract for subclasses.

  6. Key Points:
    ** Cannot create objects of an abstract class. 

    ** Can have constructors, static methods, and final methods.

  7. Example use Case:
    ** Representing a blueprint for entities with common behavior.

  8. Inheritance:
    ** Subclasses of abstract classes must implement all abstract methods or be declared abstract themselves.
  
---

Example:

  abstract class Animal {
    abstract void sound();
    void eat() {
      System.out.println("This animal eats food.");
    }
  }

  class Dog extends Animal {
    void sound() {
      System.out.println("Barks");
    }
  }

  public class Main {
    public static void main(String[] args) {
      Dog dog = new Dog();
      dog.sound();
      dog.eat();
    }
  }

  >>>
    Barks  
    This animal eats food.



// Abstract Class
abstract class Animal {
    // Abstract Method
    abstract void makeSound();

    // Concrete Method
    void eat() {
        System.out.println("This animal is eating...");
    }
}

// What Are Abstract Methods?
// Definition: An abstract method is a method declared without a body ({}), using the abstract keyword.
// Purpose: They must be implemented by the subclasses that inherit the abstract class.
// Where: Abstract methods can only exist inside abstract classes.

/*
  Key Points:
  An abstract class cannot be instantiated.
  If a class contains at least one abstract method, the class must be declared as abstract.
  Subclasses of the abstract class must provide implementations for all abstract methods, unless the subclass is also abstract.
*/


/*
  Components of Abstract Methods in Java
  Declaring an Abstract Class
  Example: abstract class Animal {}

  Abstract Method Syntax

  java
  Copy code
  abstract void makeSound();
  Concrete Methods in Abstract Classes
  Abstract classes can have both abstract and concrete (implemented) methods.

  Implementing Abstract Methods
  A subclass must override the abstract methods.
*/


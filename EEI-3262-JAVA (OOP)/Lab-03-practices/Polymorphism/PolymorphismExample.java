// Base class

class Shape {
  public void draw() {
    System.out.println("Drawing a shape...");
  }
}

// Derrived class 1
class Cicle extends Shape {
  @Override
  public void draw() {
    System.out.println("Drawing a Circle...");
  }
}

// Drrived class 2
class Rectangle extends Shape {
  @Override 
  public void draw() {
    System.out.println("Drawing a Rectangle...");
  }
}

// Main class
public class PolymorphismExample {
  public static void main(String[] args) {
    // Using polymorphism to refer to objects of different types 
    Shape shape1 = new Circle(); // Circle object
    Shape shape2 = new Rectangle(); // Rectangle object

    // Calling the overridden methods
    shape1.draw(); // Outputs: Drawing a Circle...
    Shape2.draw(); // Output: Drawing a Rectangle... 
  }
}


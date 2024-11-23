// Base class
class Shape {
    void area() {
        System.out.println("Calculating area of the shape...");
    }
}

// Derived class 1
class Circle extends Shape {
    @Override
    void area() {
        System.out.println("Area of Circle = π * r * r");
    }
}

// Derived class 2
class Rectangle extends Shape {
    @Override
    void area() {
        System.out.println("Area of Rectangle = length * breadth");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Shape myShape;

        myShape = new Circle();
        myShape.area(); // Calls Circle's overridden method

        myShape = new Rectangle();
        myShape.area(); // Calls Rectangle's overridden method
    }
}

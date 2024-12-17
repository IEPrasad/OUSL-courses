/*
Inheritance in Java
  Inheritance is an Object-Oriented Programming (OOP) concept where one class (child or subclass) acquires the properties (fields) and methods of another class (parent or superclass). It allows for reuse of existing code, reducing redundancy and improving maintainability.
*/

/*
Key Points About Inheritance

Purpose of Inheritance:
  Reuse common code across classes.
  Establish a relationship between classes (IS-A relationship).
  Enable polymorphism, where a subclass can override the behavior of a parent class.

Terminology:
  Superclass: The parent class providing the common behavior and properties.
  Subclass: The child class that inherits from the superclass.

How to Implement Inheritance in Java:
  Use the extends keyword to define a subclass.
  The subclass inherits all public and protected members of the superclass.

Types of Inheritance in Java:
  Single Inheritance: One subclass inherits from one superclass.
  Multilevel Inheritance: A subclass inherits from a superclass, and another class inherits from this subclass.
  Hierarchical Inheritance: Multiple subclasses inherit from one superclass.
  (Note: Java does not support multiple inheritance with classes to avoid ambiguity, but it allows it with interfaces.)

*/

// Superclass (Parent Class)
class Employee {
    // Common fields for all employees
    protected String name;
    protected double salary;

    // Constructor to initialize common fields
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass (Child Class)
class Manager extends Employee {
    // Additional field specific to Manager
    private String department;

    // Constructor for Manager
    public Manager(String name, double salary, String department) {
        super(name, salary); // Call to the superclass constructor
        this.department = department;
    }

    // Overriding the displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the superclass method
        System.out.println("Department: " + department);
    }

    // Additional method specific to Manager
    public void conductMeeting() {
        System.out.println(name + " is conducting a meeting in the " + department + " department.");
    }
}

// Subclass (Child Class)
class Developer extends Employee {
    // Additional field specific to Developer
    private String programmingLanguage;

    // Constructor for Developer
    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary); // Call to the superclass constructor
        this.programmingLanguage = programmingLanguage;
    }

    // Overriding the displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the superclass method
        System.out.println("Programming Language: " + programmingLanguage);
    }

    // Additional method specific to Developer
    public void writeCode() {
        System.out.println(name + " is writing code in " + programmingLanguage + ".");
    }
}

// Main class to test inheritance
public class InheritanceDemo {
    public static void main(String[] args) {
        // Create a Manager object
        Manager manager = new Manager("Alice", 75000, "HR");
        System.out.println("Manager Details:");
        manager.displayDetails();
        manager.conductMeeting();

        System.out.println();

        // Create a Developer object
        Developer developer = new Developer("Bob", 60000, "Java");
        System.out.println("Developer Details:");
        developer.displayDetails();
        developer.writeCode();
    }
}

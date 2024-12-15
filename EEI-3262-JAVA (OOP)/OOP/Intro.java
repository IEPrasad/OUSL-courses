1. What is OOP?
  Object-Oriented Programming (OOP) is a programming paradigm based on the concept of "objects", which
  can contain ata in the form of fields (often known as attributes or properties) and code 
  in the form of methods (functions). OOP helps to organize software design in a more modular
  and reusable way.


2. Key Concepts of OOP
  There are four main pillars of Object-Oriente Programming:
  1. Encapsulation 
  2. Abstraction 
  3. Inheritance
  4. Polymorphism


1. Encapsulation 

Encapsulation means bundling the data (fields) and methods (functions) that 
operate on the data into a single unit (class) and restricting access to some of 
the object's components. 
'

Code Example:

// Encapsulation
class BankAccount {
  private String accountHolderName;
  private double balance;

  // Constructor 
  public BankAccount(String accountHolderName, double initialDeposit) {
    this.accountHolderName = accountHolderName;
    this.balance = initialDeposit;
  }

  // Getter for accountHolderName
  public String getaccountHolderName() {
    return accountHolderName;
  }

  // Getter for balance 
  public double getBalance() {
    return balance;
  }

  // Method to deposit money
  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Deposit successful. New balance: " + balance);
    } else {
      System.out.println("Invalid deposit amount.");
    }
  }
}

// Main class
public class EncapsulationDemo {
  public static void main(String[] args) {
    BankAccount account = new BankAccount("Alice", 1000.00);
    System.out.println("Account Holder: " + account.getAccountHolderName());
    account.deposit(500);
    account.withdraw(200);
  }
}

-----------------------------------------------------------------------------

2. Abstraction 

Abstraction is hiding the implementation details and showing only the functionality to the user. It is achieved using "abstract classes" or interfaces.

Code Example:

// Abstract class example: Shape
abstract class Shape {
  abstract void draw(); // Abstract method

  public void displayInfo() {
    System.out.println("This is a shape.");
  }
}

class Circle extends Shape {
  @Override 
  void draw() {
    System.out.println("Drawing a Circle.");
  }
}

class Rectangle extends Shape {
  @Override 
  voide draw() {
    System.out.println("Drawing a Rectangle.");
  }
}

// Main Class
public class AbstractionDemo {
  public static void main(String[] args) {
    Shape circle = new Circle();
    circle.draw();
    circle.displayInfo();

    Shape rectangle = new Rectangle();
    rectangle.draw();
    rectangle.displayInfo();
  }
}

---------------------------------------------------------------------------

3. Inheritance

Inheritance is a mechanism where a new class (subclass) derives properties and behavior from a existing class (superclass).

Code Example:

// Inheritance example: Employee Hierarchy
class Employee {
  String name;
  double salary;

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public void displayDetails() {
    System.out.println("Employee Name: " + name);
    System.out.println("Salary: " + salary); 
  }
}

class Manager extends Employee {
  String department;

  public Manager(String name, double salary, String department) {
    super(name, salary);
    this.department = department;
  }

  @Override
  public void displayDetails() {
    super.displayDetails();
    System.out.println("Department: " + department); 
  } 
}

// Main Class
public class InheritanceDemo {
  public static void main(String[] args) {
    Manager manager = new Manager("Bob", 7500, "IT");
    manager.displayDetails();
  }
}

--------------------------------------------------------------


4. Polymorphism

Polymorphism allows methods to perform differently based on the object calls them.
It can be achieved using method overriding or method overloading.
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
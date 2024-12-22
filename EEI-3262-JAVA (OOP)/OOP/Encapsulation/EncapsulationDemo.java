/*
  Encapsulation in Java

  Encapsulation is one of the key OOP concepts that restricts access to some of the object's data and ensures that the internal state of an object is manipulated only through well-defined methods. It is ahcieved using private fields and providing public getters and setters.
*/


/*
  Theories Behind Encapsulation

  1. Purpose:
      * Protect data from unintended interface and misuse.
      * Maintain control over data by exposing only what is necessary through methods.

  2. How to Achieve Encapsulation:
      * Declare fields (attributes) as private.
      * Provide getter and setter methods to access and modify these fields.
      * Add validation logic in the setters to ensure data integrity.
  
  3. Benifits:
      * Data Hiding: Internal details are hidden, providing only necessary information.
      * Increased Security: Prevents unauthorized access.
      * Reusability: Well-encapsulated classes can be reused and modified easily.   

*/

// Encapsulation Example Code

// Scenario: A BankAccount Class 

// Class definition
class BankAccount {
  // Private fields (data hiding)
  private String accountHolderName;
  private double balance;


  // Constructor to initialize the object
  public BankAccount(String accountHolderName, double initialDeposit) {
    this.accountHolderName = accountHolderName;
    if (initialDeposit >= 0) {
      this.balance = initialDeposit;
    } else {
      System.out.println("Initial deposit must be positive. Setting balance to 0.");
      this.balance = 0;
    }
  }

  // Getter for accountHolderName 
  public String getAccountHolderName() {
    return accountHolderName;
  }

  // Setter for accountHolderName (allows name update)
  public void setAccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
  }

  // Getter for balance (real-only access)
  public double getBalance() {
    return balance;
  }

  // Method to deposit money
  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount; // Add amount to balance
      System.out.println("Deposit successful! Current Balance: $" + balance);
    } else {
      System.out.println("Invalid deposit amount.");
    }
  }

  // Method to withdraw money
  public void withdraw(double amount) {
    if (amount > 0 && balance >= amount) {
      balance -= amount // Substract amount from balance
      System.out.println("Withdrawal successful! Remaining Balance: $" + balance);
    } else {
      System.out.println("Insufficient funds or invalid withdrawal amount.");
    }
  }
}

// Main class to test the functionality 
public class EncapsulationDemo {
  public static void main(String[] args) {
    // Creata a BankAccount object
    BankAccount account = new BankAccount("Alice", 1000.00);

    // Access data using getters
    System.out.println("Account Holder: " + account.getAccountHoldername());
    System.out.println("Initial Balance: $" + account.getBalance());

    // Update account holder's name
    account.setAccountHolderName("Alice Johnson");
    System.out.println("Updated Account Holder: " + account.getAccountHolderName());

    // Perform deposit 
    account.deposit(500.00);

    // Perform withdrawal
    account.withdraw(300.00);

    // Attempt invalid withdrawal
    account.withdraw(2000.00);
  }
}

// Code Breakdown
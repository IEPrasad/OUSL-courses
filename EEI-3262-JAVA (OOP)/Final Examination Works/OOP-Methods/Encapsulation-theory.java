Encapsulation (Brief Intro):

  ** Encapsulation is one of the fundamental principles of OOP. 
  It means hiding the internal details of an object and only exposing the 
  necessary parts.

  Key Features:

    1. Data Hiding: Fields (variables) are marked as private to restrict direct access.
    2. Controlled Access: Access is provided using public getter and setter methods.  
    3. Improved Security: Prevents unauthorized or accidental modification of data.


Example 

  class BankAccount {
    // Private field 
    private double balance;

    // constructor to initialize balance 
    public BankAccount(double balance) {
      this.balance = balance;
    }

    // Getter method 
    public getBalance() {
      return balance;
    }

    // Setter method 
    public void setBalance(double balance) {
      if (balance >= 0) { // Validate balance 
        this.balance = balance;
      }
    }
  }

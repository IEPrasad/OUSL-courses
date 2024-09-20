class BankAccount:
    # Constructor to initialize account details
    def __init__(self, account_number, name, balance=0):
        self.account_number = account_number
        self.name = name
        self.balance = balance

    # Method to deposit money
    def deposit(self, amount):
        if amount > 0:
            self.balance += amount
            print(f"Deposit successful! New balance: {self.balance}")
        else:
            print("Deposit amount must be positive!")

    # Method to withdraw money
    def withdraw(self, amount):
        if amount <= self.balance:
            self.balance -= amount
            print(f"Withdrawal successful! New balance: {self.balance}")
        else:
            print("Insufficient funds for withdrawal!")

    # Method to transfer money
    def transfer(self, other_account, amount):
        if amount <= self.balance:
            self.balance -= amount
            other_account.balance += amount
            print(f"Transfer successful! New balance: {self.balance}")
        else:
            print("Insufficient funds for transfer!")

    # Method to delete an account (sets balance to zero)
    def delete_account(self):
        self.balance = 0
        print(f"Account {self.account_number} deleted. Balance set to {self.balance}")

# Function to create a new account
def create_account(account_number, name, initial_balance=0):
    return BankAccount(account_number, name, initial_balance)

# Example Usage
# Create accounts
account1 = create_account(101, "John Doe", 1000)
account2 = create_account(102, "Jane Doe", 500)

# Deposit money
account1.deposit(500)

# Withdraw money
account1.withdraw(200)

# Transfer money
account1.transfer(account2, 300)

# Delete account
account1.delete_account()

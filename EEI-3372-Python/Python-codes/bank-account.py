# class BankAccount:
#     # Constructor to initialize account details
#     def __init__(self, account_number, name, balance=0):
#         self.account_number = account_number
#         self.name = name
#         self.balance = balance

#     # Method to deposit money
#     def deposit(self, amount):
#         if amount > 0:
#             self.balance += amount
#             print(f"Deposit successful! New balance: {self.balance}")
#         else:
#             print("Deposit amount must be positive!")

#     # Method to withdraw money
#     def withdraw(self, amount):
#         if amount <= self.balance:
#             self.balance -= amount
#             print(f"Withdrawal successful! New balance: {self.balance}")
#         else:
#             print("Insufficient funds for withdrawal!")

#     # Method to transfer money
#     def transfer(self, other_account, amount):
#         if amount <= self.balance:
#             self.balance -= amount
#             other_account.balance += amount
#             print(f"Transfer successful! New balance: {self.balance}")
#         else:
#             print("Insufficient funds for transfer!")

#     # Method to delete an account (sets balance to zero)
#     def delete_account(self):
#         self.balance = 0
#         print(f"Account {self.account_number} deleted. Balance set to {self.balance}")

# # Function to create a new account
# def create_account(account_number, name, initial_balance=0):
#     return BankAccount(account_number, name, initial_balance)

# # Example Usage
# # Create accounts
# account1 = create_account(101, "John Doe", 1000)
# account2 = create_account(102, "Jane Doe", 500)

# # Deposit money
# account1.deposit(500)

# # Withdraw money
# account1.withdraw(200)

# # Transfer money
# account1.transfer(account2, 300)

# # Delete account
# account1.delete_account()


# ------- Store data in .txt file -------

# import os

# class BankAccount:
#     # Constructor to initialize account details
#     def __init__(self, account_number, name, balance=0):
#         self.account_number = account_number
#         self.name = name
#         self.balance = balance

#     # Method to deposit money
#     def deposit(self, amount):
#         if amount > 0:
#             self.balance += amount
#             self.update_account_file()
#             print(f"Deposit successful! New balance: {self.balance}")
#         else:
#             print("Deposit amount must be positive!")

#     # Method to withdraw money
#     def withdraw(self, amount):
#         if amount <= self.balance:
#             self.balance -= amount
#             self.update_account_file()
#             print(f"Withdrawal successful! New balance: {self.balance}")
#         else:
#             print("Insufficient funds for withdrawal!")

#     # Method to transfer money
#     def transfer(self, other_account, amount):
#         if amount <= self.balance:
#             self.balance -= amount
#             other_account.balance += amount
#             self.update_account_file()
#             other_account.update_account_file()
#             print(f"Transfer successful! New balance: {self.balance}")
#         else:
#             print("Insufficient funds for transfer!")

#     # Method to delete an account (sets balance to zero)
#     def delete_account(self):
#         self.balance = 0
#         self.update_account_file()
#         print(f"Account {self.account_number} deleted. Balance set to {self.balance}")

#     # Update account info in the text file
#     def update_account_file(self):
#         with open(f"{self.account_number}.txt", "w") as file:
#             file.write(f"{self.account_number},{self.name},{self.balance}\n")

# # Function to create a new account
# def create_account(account_number, name, initial_balance=0):
#     account = BankAccount(account_number, name, initial_balance)
#     account.update_account_file()  # Save to file immediately after creation
#     return account

# # Function to load an existing account from a .txt file
# def load_account(account_number):
#     if os.path.exists(f"{account_number}.txt"):
#         with open(f"{account_number}.txt", "r") as file:
#             data = file.readline().strip().split(",")
#             return BankAccount(int(data[0]), data[1], float(data[2]))
#     else:
#         print(f"Account {account_number} not found.")
#         return None

# # Example Usage
# # Create new accounts
# account1 = create_account(101, "John Doe", 1000)
# account2 = create_account(102, "Jane Doe", 500)

# # Deposit money
# account1.deposit(500)

# # Withdraw money
# account1.withdraw(200)

# # Transfer money
# account1.transfer(account2, 300)

# # Delete account
# account1.delete_account()

# # Load existing account from file
# loaded_account = load_account(102)
# if loaded_account:
#     print(f"Loaded Account {loaded_account.account_number} with balance: {loaded_account.balance}")

# --------------------------------------------

import os

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
            self.update_account_file()
            print(f"Deposit successful! New balance: {self.balance}")
        else:
            print("Deposit amount must be positive!")

    # Method to withdraw money
    def withdraw(self, amount):
        if amount <= self.balance:
            self.balance -= amount
            self.update_account_file()
            print(f"Withdrawal successful! New balance: {self.balance}")
        else:
            print("Insufficient funds for withdrawal!")

    # Method to transfer money
    def transfer(self, other_account, amount):
        if amount <= self.balance:
            self.balance -= amount
            other_account.balance += amount
            self.update_account_file()
            other_account.update_account_file()
            print(f"Transfer successful! New balance: {self.balance}")
        else:
            print("Insufficient funds for transfer!")

    # Method to delete an account (sets balance to zero)
    def delete_account(self):
        self.balance = 0
        self.update_account_file()
        print(f"Account {self.account_number} deleted. Balance set to {self.balance}")

    # Update account info in the text file
    def update_account_file(self):
        with open(f"{self.account_number}.txt", "w") as file:
            file.write(f"{self.account_number},{self.name},{self.balance}\n")

# Function to create a new account
def create_account():
    account_number = int(input("Enter a new account number: "))
    name = input("Enter account holder's name: ")
    initial_balance = float(input("Enter initial balance: "))
    account = BankAccount(account_number, name, initial_balance)
    account.update_account_file()
    print(f"Account {account_number} created successfully!\n")
    return account

# Function to load an existing account from a .txt file
def load_account(account_number):
    if os.path.exists(f"{account_number}.txt"):
        with open(f"{account_number}.txt", "r") as file:
            data = file.readline().strip().split(",")
            return BankAccount(int(data[0]), data[1], float(data[2]))
    else:
        print(f"Account {account_number} not found.")
        return None

# Function to display menu and handle user input
def bank_menu():
    while True:
        print("\n--- Bank Account System ---")
        print("1. Create Account")
        print("2. Deposit Money")
        print("3. Withdraw Money")
        print("4. Transfer Money")
        print("5. Delete Account")
        print("6. Check Account Balance")
        print("7. Exit")
        
        choice = input("Choose an option: ")

        if choice == '1':
            create_account()

        elif choice == '2':
            account_number = int(input("Enter account number: "))
            account = load_account(account_number)
            if account:
                amount = float(input("Enter amount to deposit: "))
                account.deposit(amount)

        elif choice == '3':
            account_number = int(input("Enter account number: "))
            account = load_account(account_number)
            if account:
                amount = float(input("Enter amount to withdraw: "))
                account.withdraw(amount)

        elif choice == '4':
            from_account_number = int(input("Enter sender account number: "))
            from_account = load_account(from_account_number)
            if from_account:
                to_account_number = int(input("Enter receiver account number: "))
                to_account = load_account(to_account_number)
                if to_account:
                    amount = float(input("Enter amount to transfer: "))
                    from_account.transfer(to_account, amount)

        elif choice == '5':
            account_number = int(input("Enter account number to delete: "))
            account = load_account(account_number)
            if account:
                account.delete_account()

        elif choice == '6':
            account_number = int(input("Enter account number: "))
            account = load_account(account_number)
            if account:
                print(f"Account balance for {account.name} is: {account.balance}")

        elif choice == '7':
            print("Exiting the system. Goodbye!")
            break

        else:
            print("Invalid choice. Please try again.")

# Run the bank menu
bank_menu()

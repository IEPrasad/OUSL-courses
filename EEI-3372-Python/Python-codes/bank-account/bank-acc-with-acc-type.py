import os

class BankAccount:
    def __init__(self, account_number, name, account_type, balance=0):
        self.account_number = account_number
        self.name = name
        self.account_type = account_type
        self.balance = balance

    def deposit(self, amount):
        if amount > 0:
            self.balance += amount
            self.update_account_file()
            print(f"Deposit successful! New balance: {self.balance}")
        else:
            print("Deposit amount must be positive!")

    def withdraw(self, amount):
        if amount <= self.balance:
            self.balance -= amount
            self.update_account_file()
            print(f"Withdrawal successful! New balance: {self.balance}")
        else:
            print("Insufficient funds for withdrawal!")

    def transfer(self, other_account, amount):
        if amount <= self.balance:
            self.balance -= amount
            other_account.balance += amount
            self.update_account_file()
            other_account.update_account_file()
            print(f"Transfer successful! New balance: {self.balance}")
        else:
            print("Insufficient funds for transfer!")

    def delete_account(self):
        self.balance = 0
        self.update_account_file()
        print(f"Account {self.account_number} deleted. Balance set to {self.balance}")

    def update_account_file(self):
        with open(f"{self.account_number}.txt", "w") as file:
            file.write(f"{self.account_number},{self.name},{self.account_type},{self.balance}\n")

def create_account():
    account_number = int(input("Enter a new account number: "))
    name = input("Enter account holder's name: ")

    # User chooses account type
    print("Choose account type:")
    print("1. Savings Account")
    print("2. Fixed Deposit Account (Permanent Savings Account)")
    print("3. Current Account")
    account_type_choice = input("Enter the number corresponding to the account type: ")

    if account_type_choice == '1':
        account_type = 'Savings Account'
    elif account_type_choice == '2':
        account_type = 'Fixed Deposit Account'
    elif account_type_choice == '3':
        account_type = 'Current Account'
    else:
        print("Invalid account type. Defaulting to Savings Account.")
        account_type = 'Savings Account'

    initial_balance = float(input("Enter initial balance: "))
    account = BankAccount(account_number, name, account_type, initial_balance)
    account.update_account_file()
    print(f"{account_type} with account number {account_number} created successfully!\n")
    return account

def load_account(account_number):
    if os.path.exists(f"{account_number}.txt"):
        with open(f"{account_number}.txt", "r") as file:
            data = file.readline().strip().split(",")
            return BankAccount(int(data[0]), data[1], data[2], float(data[3]))
    else:
        print(f"Account {account_number} not found.")
        return None

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
                print(f"Account Type: {account.account_type}")
                print(f"Account balance for {account.name} is: {account.balance}")

        elif choice == '7':
            print("Exiting the system. Goodbye!")
            break

        else:
            print("Invalid choice. Please try again.")

# Run the bank menu
bank_menu()

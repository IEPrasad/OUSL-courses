class Account:
    def __init__(self, acc_num, balance=0):
        self.acc_num = acc_num
        self.balance = balance

    def deposit(self, amount):
        if amount > 0:
            self.balance += amount
            print(f"Deposit successful. Current balance: {self.balance}")
        else:
            print("Invalid deposit amount.")

    def withdraw(self, amount):
        if amount > 0:
            if self.balance >= amount:
                self.balance -= amount
                print(f"Withdrawal successful. Current balance: {self.balance}")
            else:
                print("Insufficient balance.")
        else:
            print("Invalid withdrawal amount.")

    def check_balance(self):
        print(f"Account balance: {self.balance}")

    def transfer(self, recipient, amount):
        if amount > 0:
            if self.balance >= amount:
                self.balance -= amount
                recipient.balance += amount
                print("Transfer successful.")
                print(f"Your current balance: {self.balance}")
            else:
                print("Insufficient balance.")
        else:
            print("Invalid transfer amount.")


def create_account(accounts):
    acc_num = input("Enter a unique account number: ")
    if acc_num in accounts:
        print("Account number already exists.")
        return
    initial_deposit = float(input("Enter initial deposit amount: "))
    if initial_deposit < 0:
        print("Invalid initial deposit amount.")
        return
    accounts[acc_num] = Account(acc_num, initial_deposit)
    print("Account created successfully.")


def main():
    accounts = {}

    while True:
        print("\nBank Account Management System")
        print("1. Create a new account")
        print("2. Deposit money")
        print("3. Withdraw money")
        print("4. Check account balance")
        print("5. Transfer money")
        print("6. Exit")

        choice = input("Enter your choice: ")

        if choice == '1':
            create_account(accounts)
        elif choice == '2':
            acc_num = input("Enter account number: ")
            if acc_num in accounts:
                amount = float(input("Enter deposit amount: "))
                accounts[acc_num].deposit(amount)
            else:
                print("Account not found.")
        elif choice == '3':
            acc_num = input("Enter account number: ")
            if acc_num in accounts:
                amount = float(input("Enter withdrawal amount: "))
                accounts[acc_num].withdraw(amount)
            else:
                print("Account not found.")
        elif choice == '4':
            acc_num = input("Enter account number: ")
            if acc_num in accounts:
                accounts[acc_num].check_balance()
            else:
                print("Account not found.")
        elif choice == '5':
            acc_num_from = input("Enter sender's account number: ")
            acc_num_to = input("Enter recipient's account number: ")
            amount = float(input("Enter transfer amount: "))
            if acc_num_from in accounts and acc_num_to in accounts:
                accounts[acc_num_from].transfer(accounts[acc_num_to], amount)
            else:
                print("One or both accounts not found.")
        elif choice == '6':
            print("Exiting program.")
            break
        else:
            print("Invalid choice. Please choose again.")

# Call main function at the end of the script
main()

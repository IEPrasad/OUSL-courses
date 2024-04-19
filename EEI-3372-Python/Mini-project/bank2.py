class Account:
    def __init__(self, acc_num, balance=0.0):
        self.acc_num = acc_num
        self.balance = balance

    def deposit(self, amount):
        if amount > 0:
            self.balance += amount
            print(f"Deposit successful. Current balance: {self.format_balance()}")
            self.update_account_details()
        else:
            print("Invalid deposit amount.")

    def withdraw(self, amount):
        if amount > 0:
            if self.balance >= amount:
                self.balance -= amount
                print(f"Withdrawal successful. Current balance: {self.format_balance()}")
                self.update_account_details()
            else:
                print("Insufficient balance.")
        else:
            print("Invalid withdrawal amount.")

    def check_balance(self):
        print(f"Account balance: {self.format_balance()}")

    def transfer(self, recipient, amount):
        if amount > 0:
            if self.balance >= amount:
                self.balance -= amount
                recipient.balance += amount
                print("Transfer successful.")
                print(f"Your current balance: {self.format_balance()}")
                self.update_account_details()
            else:
                print("Insufficient balance.")
        else:
            print("Invalid transfer amount.")

    def format_balance(self):
        return f"{self.balance:.2f}"

    def update_account_details(self):
        with open("account_details.txt", "r+") as f:
            lines = f.readlines()
            f.seek(0)
            for line in lines:
                if self.acc_num in line:
                    line = f"{self.acc_num},{self.balance}\n"
                f.write(line)


def create_account(accounts):
    while True:
        acc_num = input("Enter a unique account number: ")
        if acc_num in accounts:
            print("Account number already exists. Please enter a different account number.")
        else:
            break
    
    initial_deposit = float(input("Enter initial deposit amount: "))
    if initial_deposit < 0:
        print("Invalid initial deposit amount.")
        return
    
    accounts[acc_num] = Account(acc_num, initial_deposit)
    with open("account_details.txt", "a") as f:
        f.write(f"{acc_num},{initial_deposit}\n")
    print("Account created successfully.")


def load_accounts():
    accounts = {}
    with open("account_details.txt", "r") as f:
        for line in f:
            acc_num, balance = line.strip().split(",")
            accounts[acc_num] = Account(acc_num, float(balance))
    return accounts


def main():
    accounts = load_accounts()

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

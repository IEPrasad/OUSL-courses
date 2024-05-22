class Account:
    def __init__(self, acc_num, balance=0):
        self.acc_num = acc_num
        self.balance = balance

    def deposit(self, amount):
        if amount > 0:
            self.balance += amount
            print(f"Yay! Money deposited successfully. Current balance: {self.balance}")
        else:
            print("Oops! Can't deposit zero or negative amount.")

    def withdraw(self, amount):
        if amount > 0:
            if self.balance >= amount:
                self.balance -= amount
                print(f"Money withdrawn! Your remaining balance: {self.balance}")
            else:
                print("Sorry! Not enough money to withdraw.")
        else:
            print("Invalid withdrawal amount.")

    def check_balance(self):
        print(f"Your current balance is: {self.balance}")

    def transfer(self, recipient, amount):
        if amount > 0:
            if self.balance >= amount:
                self.balance -= amount
                recipient.balance += amount
                print("Transfer successful! Money sent.")
                print(f"Your remaining balance: {self.balance}")
            else:
                print("Sorry, insufficient balance for transfer.")
        else:
            print("Invalid transfer amount.")


def create_account(accounts):
    acc_num = input("Enter your account number: ")
    if acc_num in accounts:
        print("Oops! Account number already exists.")
        return
    initial_deposit = float(input("How much you wanna start with? Enter initial deposit amount: "))
    if initial_deposit < 0:
        print("Come on, mate! Can't start with negative money.")
        return
    accounts[acc_num] = Account(acc_num, initial_deposit)
    print("Account created successfully! Welcome bank!")


def main():
    accounts = {}

    while True:
        print("\nWelcome to the Bank Account Details")
        print("1. Create a new account")
        print("2. Add some cash")
        print("3. Take some cash out")
        print("4. Check your cash")
        print("5. Send money to a mate")
        print("6. Quit")

        choice = input("Enter your choice: ")

        if choice == '1':
            create_account(accounts)
        elif choice == '2':
            acc_num = input("Enter your account number: ")
            if acc_num in accounts:
                amount = float(input("How much you wanna add? "))
                accounts[acc_num].deposit(amount)
            else:
                print("Oops! Account not found.")
        elif choice == '3':
            acc_num = input("Enter your account number : ")
            if acc_num in accounts:
                amount = float(input("How much you wanna take out "))
                accounts[acc_num].withdraw(amount)
            else:
                print("Oops! Account not found, ")
        elif choice == '4':
            acc_num = input("Enter your account number: ")
            if acc_num in accounts:
                accounts[acc_num].check_balance()
            else:
                print("Oops! Account not found")
        elif choice == '5':
            acc_num_from = input("Enter your account number: ")
            acc_num_to = input("Enter your mate's account number: ")
            amount = float(input("How much you wanna send? "))
            if acc_num_from in accounts and acc_num_to in accounts:
                accounts[acc_num_from].transfer(accounts[acc_num_to], amount)
            else:
                print("Oops! One or both accounts not found")
        elif choice == '6':
            print("Exiting program.")
            break
        else:
            print("Oops! Not a valid choice, Try again.")

if __name__ == "__main__":
    main()




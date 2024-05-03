class Account:
    def __init__(self, acc_num, balance=0):
        self.acc_num = acc_num
        self.balance = balance

    def withdraw(self, amount):
        if amount > 0:
            if self.balance >= amount:
                self.balance -= amount
                print(f"Withdrawal successful. Current balance: {self.balance}")
            else:
                print("Insufficient balance.")
        else:
            print("Invalid withdrawal amount.")

class SavingsAccount(Account):
    def withdraw(self, amount):
        if amount > 0:
            if self.balance >= amount:
                self.balance -= amount
                print(f"Withdrawal from savings account successful. Current balance: {self.balance}")
            else:
                print("Insufficient balance.")
        else:
            print("Invalid withdrawal amount for savings account.")

class CurrentAccount(Account):
    def withdraw(self, amount):
        if amount > 0:
            if self.balance >= amount:
                self.balance -= amount
                print(f"Withdrawal from current account successful. Current balance: {self.balance}")
            else:
                print("Insufficient balance.")
        else:
            print("Invalid withdrawal amount for current account.")

def main():
    savings_acc = SavingsAccount("SA001", 1000)
    current_acc = CurrentAccount("CA001", 2000)

    accounts = [savings_acc, current_acc]

    for acc in accounts:
        acc.withdraw(500)

if __name__ == "__main__":
    main()

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

    def calculate_interest(self, period_in_months):
        interest_rate = self.get_interest_rate()
        total_interest = (self.balance * (interest_rate / 100) * (period_in_months / 12))
        print(f"Interest for {period_in_months} months: {total_interest}")
        self.balance += total_interest
        self.update_account_file()
        print(f"New balance after interest: {self.balance}")

    def get_interest_rate(self):
        # Define interest rate based on balance
        if self.balance >= 2000000:  # More than 20 lakh
            return 12
        elif self.balance >= 1000000:  # Between 10 lakh and 20 lakh
            return 8
        elif self.balance >= 500000:  # Between 5 lakh and 10 lakh
            return 5
        elif self.balance >= 100000:  # Between 1 lakh and 5 lakh
            return 3
        else:
            return 0  # Less than 1 lakh

    def update_account_file(self):
        with open(f"{self.account_number}.txt", "w") as file:
            file.write(f"{self.account_number},{self.name},{self.account_type},{self.balance}\n")

def create_account():
    account_number = int(input("Enter a new account number: "))
    name = input("Enter account holder's name: ")

    # User chooses account type
    print("Choose account type:")
    print("1. Savings Account")

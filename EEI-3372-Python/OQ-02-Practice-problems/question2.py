Encapsulation

Question: Define a class BankAccount with private attributes account_number and balance. Provide methods to deposit money, 
withdraw money, and check the balance. Ensure that the balance cannot go negative.

class BankAccount:
    def __init__(self, account_number, balance=0):
        self.__account_number = account_number
        self.__balance = balance

    def deposit(self, amount):
        if amount > 0:
            self.__balance += amount

    def withdraw(self, amount):
        if 0 < amount <= self.__balance:
            self.__balance -= amount
        else:
            print("Insufficient funds")

    def check_balance(self):
        return self.__balance

my_account = BankAccount("123456")
my_account.deposit(1000)
my_account.withdraw(500)
print(f'Balance: {my_account.check_balance()}')





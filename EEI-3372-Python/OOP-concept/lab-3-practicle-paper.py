# # Question 01

# name = str(input("Enter your name: "))
# age = int(input("Enter your age: "))
# city = str(input("Enter your city: "))
# sNumber = str(input("Enter your sNumber: "))
# maried = str(input("Enter your maried or not: "))

# print(f"Hello World! I am {name} and I am {age} years old")

# print (f"I am from {city}")

# print(f"Student number: {sNumber}")

# if (maried == "yes" or maried =="Yes" or maried =="YES"): 
#   print("Maried : True")

# elif (maried == "no" or maried == "No" or maried == "NO"):
#   print("Married : False")



# Question 01

# a = int(input("Enter number one: "))
# b = int(input("\nEnter number two: "))

# def add (a, b):
#   print(f"\nAddition: {a + b}")

# def substract(a, b):
#   if ( a > b):
#     print(f"\nSubstraction: {a - b}")
#   else:
#     print(f"\nSubstraction: {b-a}")


# add(a, b)
# substract(a, b)
  
# ------------------------

# Question 03

# sNumber : s23010155
# last digit: 5

# class Book:
#   def __init__(self, name, price, color, author):
#     self.name = name
#     self.price = price
#     self.color = color
#     self.author = author 

#   def weight(self, weight):
#     self.weight = weight
#     return weight
#     # pass

# book1 = Book("python", "300Rs", "Red", "Isuru")
# print("The book name is:",book1.name)
# print("The book price is:", book1.price)
# print("The book color is:", book1.color)
# print("The book author is:", book1.author)

# book1.weight(300)
# print("The weight of the book:", book1.weight)

# -------- 

# if the object is a BankAccount

class BankAccount:
  def __init__(self, account_number, account_holder, balance, account_type):
    self.account_number = account_number
    self.account_holder = account_holder
    self.balance = balance
    self.account_type = account_type

  def deposit(self, amount):
    self.balance += amount
    print(f"Deposit {amount} into {self.account_type} accout. New balance: {self.balance}")

  def withdrew(self, amount):
    if amount <= self.balance:
      self.balance -= amount
      print(f"Withdrew {amount} from {self.account_type} account. New balance: {self.balance}")
    else:
      print("Insufficient funds!")

# Creating an instance of the BankAccount class
my_bank_account = BankAccount("1010424923", "J.V.G.I.E Prasad", 1000, "Saving")

# Testing the deposit method
my_bank_account.deposit(500)

# Testing the withdrew method
my_bank_account.withdrew(200)
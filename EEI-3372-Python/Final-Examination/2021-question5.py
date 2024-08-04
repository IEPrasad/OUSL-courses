# (a) Explain the multiple inheritance in python using and example.

# Multiple inheritance in Python allows a class to inherit from more 
# than one parent class, combining functionalities from mulitple 
# sources. It enables more flexible and reusable code. 
'''

class Parent1:
  def feature1(self):
    print("This is feature 1")

class Parent2:
  def feature2(self):
    print("This is feature 2")

class child(Parent1, Parent2):
  def feature3(self):
    print("This is feature 3 from child class")

Object_or_instance = child()

Object_or_instance.feature1()
Object_or_instance.feature2()
Object_or_instance.feature3()

'''

# (b) 

'''

import sys

List = ["a", 0, 2]
for entry in List:
  try:
    print("The entry is", entry)
    r = 1/int(entry)
    break
  except:
    print("Oops!", sys.exc_info()[0], "occurred.")
    print("Next entry.")
    print()
print("The reciprocal of", entry, "is", r)

# The code attempts to use sys.exc_info()[0] without importing the sys module, resulting in a NameError.

'''
# (c)

for i in range (20, 51):
  if (i == 23 or i ==47 or i == 49):
    continue
  else:
    print(i)
  


# (d) What is the difference between semantic errors and syntax errors in Python. Give an example for both errors. 


Syntax Errors:

    Occur when the code violates the rules of the programming language.
    Example: print("Hello World (missing closing quote)

Semantic Errors:

    Occur when the code runs without syntax errors but produces incorrect results due to logical mistakes.
    Example: area = length + width (should be area = length * width)


# (e) Briefly explain what Alpha testing and Beta testing are in Software testing.


Alpha Testing:

    ** Conducted by internal teams within the organization.
    ** Takes place in the development environment before the product is released to external users.
    ** Aims to identify bugs and issues early in the development process.

Beta Testing:

    ** Conducted by a select group of external users.
    ** Takes place in the real-world environment after Alpha testing.
    ** Aims to gather feedback from actual users and identify any remaining issues before the final release.




"""
  Inheritance is a fundamental cocept in object-oriented programming that allows you to 
  create new classes based on existing classes. The new class, called a sub class or derived class, 
  inherits attributes and methods from the existing class, called superclass or base class. This 
  promotes code reusability and allows you to create a hierachy of classes.
"""

# Define a superclass

class Animal:
  def __init__(self, species):
    self.species = species

  def speak(self, name):
    pass # This method will be overridden in subclasses


# Define a subclass that inherits from Animal
class Dog(Animal):
  def __init__(self, name):
    super().__init__("Dog") # Call the superclass's constructor
    self.name = name

  def speak(self):
    return "woof!"

# Define another subclass that inherits from Animal
class Cat(Animal):
  def __init__(self, name):
    super().__init__("Cat") # Call the superclass's constructor 
    self.name = name 

  def speak(self):
    return "Meow!"

# Create instances of the subclasses
dog = Dog("Buddy")
cat = Cat("Whiskers")

# Access attributes and call mehtod
print(f"{dog.name} is a {dog.species}")
print(f"{dog.name} says: {dog.speak()}")

print(f"{cat.name} is a {cat.species}")
print(f"{cat.name} says: {cat.speak()}")

# ----------------------------------------------------



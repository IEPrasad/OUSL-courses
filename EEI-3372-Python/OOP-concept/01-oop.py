"""

** Object-Oriented Programming is a poerful paradigm that allows you to orgranize your code in a more 
modular and reusable way by using 
    objects and classes.
Here's a brief overview of some key concepts in OOP.
 
"""

"""


1. Classes and Objects:
    . A class is a blueprint for creating objects. It defines the properties (attributes) and behaviors
    (methods) that objects of the class will have.

    . An object is an instance of a class. It represents a specific instance of the class, with 
    its own unique data.

2. Attributes:
    . Attributes are the properties of an object. They store data about the object.
    
    . Attributes are accessed using dot notation ('object.attribute').

3. Methods
    . Methods are functions defined within a class that operate on objects of that class.
    
    . They can modify the object's state or perform some action related to the object.

4. Inheritance:
    . Inheritance allows a class (subclass) to inherit the attributes and methods of another class (sueperclass).
    
    . This promotes code resusability and allows you to create a hiearachy of classes.

5. Polymorphism:
    . Polymorphism allows objects of different classes to be treated as objects of a common superclass.

    . It allows methods to behave differently based on the obejct they are called on.

6. Encapsulation:
    . Encapsulation is the concept of bundling the data (attribute) and methods that operate on the data within a single unit (i.e., the class).

    . It helps in binding the internal state of an object and only exposing necessaray functionalities. 

7. Abstraction:
    . Abstraction refers to hiding the complex implementation details and only showing the necessaray features of an obejct.

  To get started, let's create a simple example:

"""
  # --------------------

  # Define a class 
class Dog:
  # Constructor method to initialize attributes
  def __init__(self, name, age):
    self.name = name 
    self.age = age

  # Method to make the dog bark
  def bark(self):
    print(f"{self.name} says Woof!")

# Create an instance of the Dog class
my_dog = Dog("Buddy", 3)

# Access attributes and call methods
print(f"My dog's name is my {my_dog.name}")
print(f"My do is {my_dog.age} years old.")

my_dog.bark()


# ----- ^^ this is just a basic example to get you started 














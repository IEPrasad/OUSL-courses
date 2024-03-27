# Class and Instances 

# Class 

# Object 

# Example 

class Dog:
  def __init__(self, name, age):
    self.name = name
    self.age = age

  # deatails 
  def details(self):
    print('The name is', self.name)
  
  # behaves - bark
  def bark(self):
    print("Baw Baw")
  
  # behave - eat
  def eat(self, food):
    print("Eating", food)

dog1 = Dog("tommy", 2)
dog2  = Dog("niko", 2)

dog1.details()
dog2.details()

dog1.bark()
dog2.bark()




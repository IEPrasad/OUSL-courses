# This is the practice code for the inheritance in python OOP programming 

class Dog:
  def __init__(self, name, age):
    self.name = name
    self.age = age
  
  def color(self):
    pass

class cub1(Dog):
  def __init__(self, name, age):
    super().__init__(name, age)

  def color(self):
    print("cub1 name is brown")

ob1 = Dog("tommy", 2)
ob2 = cub1("Max", 4)

ob1.color()
ob2.color()

print(ob2.age)



















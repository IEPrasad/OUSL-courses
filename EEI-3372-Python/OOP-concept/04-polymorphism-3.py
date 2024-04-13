# This another sample and advanced code for the python polymorphism

class Animal:
  def speak(self):
    pass

class Dog(Animal):
  def speak(self):
    return "Woof!"

class Cat(Animal):
  def speak(self):
    return "Meow!"

class Duck(Animal):
  def speak(self):
    return "Quack!"

class Cow(Animal):
  def speak(self):
    return "Moo!"

class Lion(Animal):
  def speak(self):
    return "Roar!"

class Zoo:
  def __init__(self, animals):
    self.animals = animals
  
  def make_sounds(self):
    for animal in self.animals:
      print(animal.speak())

# creating instance of different animals
dog = Dog()
cat = Cat()
duck = Duck()
cow = Cow()
lion = Lion()

# creating a zoo with different animals 
zoo = Zoo([dog, cat, duck, cow, lion])

# making the animals in the zoo make sounds
zoo.make_sounds()



# -------- this is very good code for learing polymorphism in python oop programming !------

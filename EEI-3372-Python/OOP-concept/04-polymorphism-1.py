# this is the practice for the polymorphism


class Animal:
  def speak(self):
    pass


class Dog(Animal):
  def speak(self):
    return "Woof!"

class Cat(Animal):
  def speak(self):
    return "Meow"

class Cow(Animal):
  def speak(self):
    return "Moo!"

def animal_sound(animal):
  return animal.speak()

dog = Dog()
cat = Cat()
cow = Cow()

print(animal_sound(dog)) # Output: Woof!
print(animal_sound(cat)) # Output: Meow
print(animal_sound(cow)) # Output: Moo!

### this is really nice code !

# there is another one called method overriding 
# in here the speak method has overriding 

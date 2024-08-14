# Base class
class Animal:
    def speak(self):
        raise NotImplementedError("Subclasses must implement this method")

# Derived class
class Dog(Animal):
    def speak(self):
        return "Woof!"

# Another derived class
class Cat(Animal):
    def speak(self):
        return "Meow!"

# Function demonstrating polymorphism
def animal_sound(animal):
    print(animal.speak())

# Creating instances of the derived classes
dog = Dog()
cat = Cat()

# Demonstrating polymorphism
animal_sound(dog)  # Output: Woof!
animal_sound(cat)  # Output: Meow!

Class and Object Creation

    Question: Define a class named Car with attributes make, model, and year. Create an object of this class and print the attributes.


class Car:
def __init__(self, make, model, year):
    self.make = make
    self.model = model
    self.year = year

my_car = Car('Toyota', 'Corolla', 2020)
print(f'Make: {my_car.make}, Model: {my_car.model}, Year: {my_car.year}')


Inheritance

    Question: Create a base class Animal with a method make_sound that prints a generic sound. Then create a subclass Dog that overrides make_sound to print "Bark". Demonstrate the method overriding by creating an object of the Dog class.

class Animal:
    def make_sound(self):
        print("Some generic sound")

class Dog(Animal):
    def make_sound(self):
        print("Bark")

my_dog = Dog()
my_dog.make_sound()

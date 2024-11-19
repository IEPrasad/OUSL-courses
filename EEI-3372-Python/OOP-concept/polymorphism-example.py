# # Parent Class
# class Animal:
#     def sound(self):
#         return "This animal makes a sound"

# # Child Class 1
# class Dog(Animal):
#     def sound(self):
#         return "Woof! Woof!"

# # Child Class 2
# class Cat(Animal):
#     def sound(self):
#         return "Meow! Meow!"

# # Function demonstrating polymorphism
# def make_sound(animal):
#     print(animal.sound())

# # Creating objects
# dog = Dog()
# cat = Cat()

# # Calling the function with different objects
# make_sound(dog)  # Output: Woof! Woof!
# make_sound(cat)  # Output: Meow! Meow!


# Base Class
class Shape:
    def area(self):
        raise NotImplementedError("Subclasses must override the 'area' method")

    def perimeter(self):
        raise NotImplementedError("Subclasses must override the 'perimeter' method")

# Circle Class
class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius

    def area(self):
        return 3.14159 * self.radius**2

    def perimeter(self):
        return 2 * 3.14159 * self.radius

# Rectangle Class
class Rectangle(Shape):
    def __init__(self, width, height):
        self.width = width
        self.height = height

    def area(self):
        return self.width * self.height

    def perimeter(self):
        return 2 * (self.width + self.height)

# Triangle Class
class Triangle(Shape):
    def __init__(self, base, height, side_a, side_b):
        self.base = base
        self.height = height
        self.side_a = side_a
        self.side_b = side_b

    def area(self):
        return 0.5 * self.base * self.height

    def perimeter(self):
        return self.base + self.side_a + self.side_b

# Demonstrating polymorphism
shapes = [
    Circle(5),  # Circle with radius 5
    Rectangle(4, 6),  # Rectangle with width 4 and height 6
    Triangle(3, 4, 5, 6)  # Triangle with base 3, height 4, and sides 5, 6
]

for shape in shapes:
    print(f"Shape: {type(shape).__name__}")
    print(f"Area: {shape.area():.2f}")
    print(f"Perimeter: {shape.perimeter():.2f}")
    print("-" * 30)

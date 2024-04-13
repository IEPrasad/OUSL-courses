# This is anther advanced code for the polymorphism

class Shape:
  def area():
    pass

class Circle(Shape):
  def __init__(self, radius):
    self.radius = radius
  
  def area(self):
    return 3.14 * self.radius ** 2

class Rectangle(Shape):
  def __init__(self, length, width):
    self.length = length
    self.width = width 

  def area(self):
    return self.length * self.width

class Triangle(Shape):
  def __init__(self, base, height):
    self.base = base
    self.height = height
  
  def area(self):
    return 0.5 * self.base * self.height


def calculate_area(shape):
  return shape.area()
  


circle = Circle(5)
rectangle = Rectangle(4, 6)
triangle = Triangle(3, 8)

print("Area of circle:", calculate_area(circle))
print("Area of rectangle:", calculate_area(rectangle))
print("Area of the triangle:", calculate_area(triangle))

















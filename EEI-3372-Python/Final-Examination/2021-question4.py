"""
# a) List three types of arguments usded in Python 
        1. Positional Arguments 
        2. Keyword Arguments
        3. Default Arguments


1. Positional 

def greet(name, age):
  print(f"Hello, my name is {name} and I am {age} years old.")

greet("Alice", 30)


2. Keyword 

def greet(name, age):
  print(f"Hello, my name is {name} and I am {age} years old.")

greet(name="Alice", age=30)

3. Default 


def greet(name, age=25):
  print(f"Hello, my name is {name} and I am {age} years old.")

greet("Alice")
greet("Eranda", 22)

"""

# b)

print("Select a shape: Cube, Cuboid")
shape = str(input("Shape: "))

def cal_cube():
  l = int(input("Length: "))
  volume = l*l*l
  print(f"Volume: {volume}cm^3")

def cal_cuboid():
  l = int(input("Length: "))
  w = int(input("Wdith: "))
  h = int(input("Height: "))

  volume = l * w * h
  print(f"Volume: {volume}cm^3")

if (shape == "Cube"):
  cal_cube()
elif (shape == "Cuboid"):
  cal_cuboid()



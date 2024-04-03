# first we look for the simple class

# class Phone:
#   def say(self, name):
#     self.x = name
#     print("hello", name)

# phone1 = Phone()
# phone1.say("nokia")
# print(phone1.x)

# phone1.x = "apple"
# print(phone1.x)

# phone2 = Phone()
# phone2.say("samsung")

# ----------------
# Let's see another one


# class Dog:
#   species = "Canis familiaris"

#   def __init__(self, name, age):
#     self.name = name 
#     self.age = age

#   # Instance method 
#   def description(self):
#     return f"{self.name} is {self.age} years old"
  
#   # Another instance method
#   def speak(self, sound):
#     self.x = sound
#     return f"{self.name} says {sound}"

# # now let's create an object for that 
# dog1 = Dog("tommy", "10")
# print(dog1.description())
# print(dog1.speak("baw baw"))
# dog1.x = "mew mew"
# print(dog1.x)
# ------- 

# class person:
#   greeting = "welcome"

#   def __init__(self, name, age):
#     self.name = name
#     self.age = age

#   def detail(self):
#     return f"{self.name} is {self.age} years old"

#   def eating(self, food_name):
#     self.food_name = food_name
#     return f"{self.name} is eating {food_name}"

#   def favorits(self):
#     return f"favorite food is {self.food_name}"
    

# person1 = person("saman", 22)
# print(person1.detail())
# print(person1.eating("kottu"))
# print(person1.favorits())

# ------------------------------------------------------

class Person:
  def __init__(self, fname, lname):
    self.firstname = fname 
    self.lastname = lname 
  
  def print_name(self):
    print(self.firstname, self.lastname)

class Student(Person):
  def __init__(self, fname, lname, year):
    super().__init__(fname, lname)
    self.graduationyear = year

  def welcome(self):
    print("Welcome", self.firstname, self.lastname, "to the class of", self.graduationyear)


person1 = Person("Kamal", "nishantha")
student1 = Student("Kasun", "Nimal", 2020)
student1.welcome()

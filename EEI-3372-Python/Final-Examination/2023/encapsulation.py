class Person:
    def __init__(self, name, age):
        self.__name = name  # Private variable
        self.__age = age    # Private variable

    def set_name(self, name):
        self.__name = name  # Method to set private variable

    def get_name(self):
        return self.__name  # Method to get private variable

    def set_age(self, age):
        if age > 0:
            self.__age = age  # Method to set private variable
        else:
            print("Age must be positive.")

    def get_age(self):
        return self.__age  # Method to get private variable

# Creating an instance of Person
person = Person("Alice", 30)

# Accessing private variables using public methods
print(person.get_name())  # Output: Alice
print(person.get_age())   # Output: 30

# Modifying private variables using public methods
person.set_name("Bob")
person.set_age(25)

print(person.get_name())  # Output: Bob
print(person.get_age())   # Output: 25

# Trying to access private variables directly (will raise an error)
# print(person.__name)  # AttributeError

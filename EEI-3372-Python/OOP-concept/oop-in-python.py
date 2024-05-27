# Defining a Class and Creating an Object

class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def display(self):
        print(f"Name: {self.name}, Age: {self.age}")

# Creating an object of the Person class
person1 = Person("Alice", 30)
person1.display()


# Inheritance in Python

class Employee(Person):
    def __init__(self, name, age, employee_id):
        super().__init__(name, age)
        self.employee_id = employee_id

    def display(self):
        super().display()
        print(f"Employee ID: {self.employee_id}")

# Creating an object of the Employee class
employee1 = Employee("Bob", 25, "E12345")
employee1.display()

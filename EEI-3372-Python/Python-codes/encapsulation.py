  class Car:
    def __init__(self, make, model, year):
        self.__make = make   # Encapsulated attribute
        self.__model = model  # Encapsulated attribute
        self.__year = year   # Encapsulated attribute

    # Getter methods
    def get_make(self):
        return self.__make

    def get_model(self):
        return self.__model

    def get_year(self):
        return self.__year

    # Setter methods
    def set_make(self, make):
        self.__make = make

    def set_model(self, model):
        self.__model = model

    def set_year(self, year):
        self.__year = year

# Creating an instance of the Car class
my_car = Car("Toyota", "Camry", 2022)

# Accessing attributes using getter methods
print("Make:", my_car.get_make())
print("Model:", my_car.get_model())
print("Year:", my_car.get_year())

# Modifying attributes using setter methods
my_car.set_make("Honda")
my_car.set_year(2023)

# Displaying modified attributes
print("\nMake (modified):", my_car.get_make())
print("Year (modified):", my_car.get_year())

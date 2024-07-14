Class and Object Creation

    Question: Define a class named Car with attributes make, model, and year. Create an object of this class and print the attributes.


    class Car:
    def __init__(self, make, model, year):
        self.make = make
        self.model = model
        self.year = year

my_car = Car('Toyota', 'Corolla', 2020)
print(f'Make: {my_car.make}, Model: {my_car.model}, Year: {my_car.year}')

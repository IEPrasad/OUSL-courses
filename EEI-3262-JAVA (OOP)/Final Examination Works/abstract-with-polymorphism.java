// Abstract Class
abstract class Vehicle {
    private String brand;

    // Constructor
    Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract Method
    abstract void start();

    // Concrete Method
    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Subclass 1: Car
class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println("Car is starting with a key ignition.");
    }
}

// Subclass 2: Motorcycle
class Motorcycle extends Vehicle {
    Motorcycle(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println("Motorcycle is starting with a button press.");
    }
}

// Subclass 3: Truck
class Truck extends Vehicle {
    Truck(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println("Truck is starting with a heavy-duty engine.");
    }
}

// Rental System demonstrating polymorphism
class RentalSystem {
    public void rentVehicle(Vehicle vehicle) {
        System.out.println("Renting a vehicle...");
        vehicle.displayBrand();
        vehicle.start(); // Polymorphism: Calls the start method of the appropriate subclass
        System.out.println("Vehicle rented successfully!\n");
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        RentalSystem rentalSystem = new RentalSystem();

        // Creating Vehicle objects (polymorphism at work)
        Vehicle car = new Car("Toyota");
        Vehicle motorcycle = new Motorcycle("Honda");
        Vehicle truck = new Truck("Volvo");

        // Renting vehicles
        rentalSystem.rentVehicle(car);
        rentalSystem.rentVehicle(motorcycle);
        rentalSystem.rentVehicle(truck);
    }
}



/*
// >>> 
Renting a vehicle...
Brand: Toyota
Car is starting with a key ignition.
Vehicle rented successfully!

Renting a vehicle...
Brand: Honda
Motorcycle is starting with a button press.
Vehicle rented successfully!

Renting a vehicle...
Brand: Volvo
Truck is starting with a heavy-duty engine.
Vehicle rented successfully!


*/


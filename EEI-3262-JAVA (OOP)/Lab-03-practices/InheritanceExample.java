// Base class
class Animal {
  private String name;
  private int age;

  // Constructor for the Animal class
  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // Getter for name
  public String getName() {
    return name;
  }

  // Getter for age
  public int getAge() {
    return age;
  }

  // Method to display information about the animal 
  public void displayInfo() {
    System.out.println("Animal Name: " + name);
    System.out.println("Age: " + age + "years");
  }
}

// Derived class that inherits from Animal 
class Dog extends Animal {
  private String breed;

  // Constructor for the Dog class
  public Dog(String name, int age, String breed) {
    super(name, age); // Call the constructor of the Animal class
    this.breed = breed;
  }

  // Getter for breed 
  public String getBread() {
    return breed;
  }

  // Overriding the displayInfor method to add breed details 
  @Override 
  public void displayInfo(){
    super.displayInfo(); // Call the displayInfo method from Animal
    System.out.println("Bread: " + breed);
  }

  
  // Method specific to Dog
  public void bark() {
    System.out.println(getName() + " is barking!"); 
  }
} 

// Main class to test inheritance 
public class InheritanceExample {
  public static void main(String[] args) {
    // Creating an object of the Dod class
    Dog myDog = new Dog("Buddy", 3, "Golden Retriver");

    // Displaying information about the Dog
    myDog.displayInfo();

    // Calling a method specific to the Dog class
    myDog.bark();
  }
}
Encapsulation: Using private fields and public getters/setters

class Person {
  private String name;
  private int age;

  // constructor 
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
    // We can create constructors without public keyword, when we need to access it outside of the class we have to use the public keyword 

    // And also we can't create constructors from outside of the class. *****

  // Getters and Setters 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // Method to display person details
  public void display() {
    System.out.println("Name: " + name + ", Age: " + age);
  }
}

// ------------------------------------------------------------------------------------

// Inheritance: Student class inherits from Person class 
class Student extends Person {
  private String studentId;

  // Constructor 
  public Student(String name, int age, String studentId) {
    super(name, age); // Calling the constructor of the superclass (Person)
    this.studentId = studentId;
  }

  // Getter and Setter for studentId
  public String getStudentId() {
    return studentId;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }

  // Overriding the display method (Polymorphism)
  @Override
  public void display() {
    super.display();  // Calling the display method of the superclass (Person)
    System.out.println("Student ID: " + studentId);
  }
} 

// Abstraction: Interface defining a contract 
interface Displayable {
  void display();
}


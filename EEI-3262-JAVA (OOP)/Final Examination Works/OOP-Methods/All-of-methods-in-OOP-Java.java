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

// Implementing the interface in the person class 
class Teacher extends Person implements Displayable {
  private String subject;
  
  // Constructor 
  public Teacher(String name, int age, String subject) {
    super(name, age);
    this.subject = subject;
  }

  // Getter and Setter for subject 
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  // Implementing the display method from the Displayable interface 
  @Override 
  public void display() {
    super.display();
    System.out.println("Subject: " + subject);   
  }
}

// Main class to demonstrate the concepts 
public class Intro {
  public static void main(String[] args) {
    // Creating objects
    Person person = new Person("Alice", 30);
    Student student = new Student("Bob", 20, "S12345");
    Teacher teacher = new Teacher("Charlie", 40, "Mathematics");

    // Displaying details
    person.display();
    student.display();
    teacher.display();
  }
}
class Employee {
  private String name;
  private int age;
  private boolean married;
  private double salary;
  private String department;

  // Constructor
  public Employee(String name, int age, boolean married) {
    this.name = name;
    this.age = age;
    this.married = married;
  }

  // Getter for name
  public String getName() {
    return name;
  }

  // Getter for age
  public int getAge() {
    return age;
  }

  // Getter for married status
  public boolean isMarried() {
    return married;
  }

  // Getter and setter for salary
  public double getSalary() {
    return salary;
  }
class Employee {
  private String name;
  private int age;
  private boolean married;
  private double salary;
  private String department;

  // Constructor
  public Employee(String name, int age, boolean married) {
    this.name = name;
    this.age = age;
    this.married = married;
  }

  // Getter for name
  public String getName() {
    return name;
  }

  // Getter for age
  public int getAge() {
    return age;
  }

  // Getter for married status
  public boolean isMarried() {
    return married;
  }

  // Getter and setter for salary
  public double getSalary() {
    return salary;
  }

  public void setSalary(double newSalary) {
    salary = newSalary;
  }

  // Getter and setter for department
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String newDepartment) {
    department = newDepartment;
  }

  // Method to simulate work
  public void doWork(String workToPerform) {
    System.out.println("I am doing: " + workToPerform);
  }
}

class Company {
  public static void main(String[] args) {
    Employee emp1 = new Employee("Nipun", 35, true);
    Employee emp2 = new Employee("Shani", 25, false);
  
    // Interacting with new Employee emp1
    System.out.println(emp1.getName());
    System.out.println(emp1.getAge());
    System.out.println(emp1.isMarried());
    emp1.doWork("Arrange the Files");

    // Interacting with new Employee emp2 
    System.out.println(emp2.getName());
    System.out.println(emp2.getAge());
    System.out.println(emp2.isMarried());
    emp2.doWork("Answer the calls");
  }
}

  public void setSalary(double newSalary) {
    salary = newSalary;
  }

  // Getter and setter for department
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String newDepartment) {
    department = newDepartment;
  }

  // Method to simulate work
  public void doWork(String workToPerform) {
    System.out.println("I am doing: " + workToPerform);
  }
}

class Company {
  public static void main(String[] args) {
    Employee emp1 = new Employee("Nipun", 35, true);
    Employee emp2 = new Employee("Shani", 25, false);
  
    // Interacting with new Employee emp1
    System.out.println(emp1.getName());
    System.out.println(emp1.getAge());
    System.out.println(emp1.isMarried());
    emp1.doWork("Arrange the Files");

    // Interacting with new Employee emp2 
    System.out.println(emp2.getName());
    System.out.println(emp2.getAge());
    System.out.println(emp2.isMarried());
    emp2.doWork("Answer the calls");
  }
}

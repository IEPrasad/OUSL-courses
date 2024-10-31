public class VariableExample {
  
  // Instance Variable (belongs to each object)
  private String instanceVariable = "I am an instance variable";

  // Static Variable (shared across all objects of the class)
  public static int staticVariable = 0;

  // Final Variable (constant, cannot be changed once initiablized)
  public final int finalVariable = 10;


  // Constructor 
  public VariableExample() {
    
    // Local Variable (declared within the constructor, only accessible within )
    String localMessage = "I am a local variable in a method";
    System.out.println(localMessage);

    // Accessing instance and static variables
    System.out.println("Instance Variable: " + instanceVariable);
    System.out.println("Static Variable: " + staticVariable);
    System.out.println("Final Variable: " + finalVariable);
 
  }

  public static void main(String[] args) {

    // Accessing static  variable directly from the class
    System.out.println("Static Variable (befor object created): " + VariableExample.staticVariable);

    // Creating the first instance of VariableExample
    VariableExample example1 = new VariableExample();
    example1.displayVariables();

    // Modifying the first instance of VariableExample
    VariableExample.staticVariable = 5;

    // Creating a second instance 
    VariableExample example2 = new VariableExample();
    example2.displayVariables();

    // Observing that staticVariable is shared and thus its value is 5 in both instances
  }
}

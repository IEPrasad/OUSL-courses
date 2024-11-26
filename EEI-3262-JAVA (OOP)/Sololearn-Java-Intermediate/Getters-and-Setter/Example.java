/* 
When Creating classes. For each variable, the "get" method returns its value,
while the "set" method sets the value.

"Getters" start with "get", followed by the variable name, with first letter of
the variable name capitalized.

"Setters" start with "set", followed by the variable name, with the first 
letter of the variable name capitalized.
*/

public class Vehicle {
  private String color;
  
  // Getter 
  public String getColor() {
    return color;
  }

  // Setter
  public void setColor(String c) {
    this.color = c;
  }
}

// The "getter" method returns the value of the attribute.
// The "setter" mehtod takes a parameter and assigns it to the attribute.


/*
  ---- The keyword "this" is used to refer to the current object. Basically,
        this.color is the color attribute of the current object.
*/ 

class Vehicle {               // Class name
    _ attributes _            // Attributes (fields)
    - private String color;

    _ methods _               // Getter and Setter
    | - Getter: public String getColor() { return color; }
    | - Setter: public void setColor(String c) { this.color = c; }

    _ main method _           // Main method to run
    = public static void main(String[] args) {
        | - Create object: Vehicle car = new Vehicle();
        | - Set value: car.setColor("Red");
        | - Get and print: System.out.println(car.getColor());
    }
}


// we can tell this using the another way 


class ClassName { // Define the class
    _ attributes (variables) _      // Declare variables (fields)
    - Example: private String color;


    _ methods (functions) _         // Define methods 
    | - Getter : public Type getVarName() { return variable; }
    | - Setter : public void setVarName(Type param) { this.variable = param; }


    _ main method (entry point) _   // Main method to run the program 
    = public static void main(String[] args) {
      | - Create object : ClassName obj = new ClassName();
      | - Use setter : Obj.setVarName(value);
      | - Use getter : System.out.println(obj.getVarName());
    }
}

// Sample Code from sololearn 

public class Vehicle {
  private String color;

  // Getter 
  public String getColor() {
    return color;
  }

  // Setter 
  public void setColor(String c) {
    this.color = c;
  }
}

class Program {
  public static void main(String[] args) {
    Vehicle v1 = new Vehicle();
    v1.setColor("Red");
    System.out.println(v1.getColor());
  }
}


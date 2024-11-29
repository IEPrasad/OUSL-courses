public class multiple_exceptions_sample {
  static int div(int a, int b) throws ArithmeticException {
    if(b == 0) {
      throw new ArithmeticException("Division by zero");
    } else {
      return a / b;
    }
  }
    public static void main(String[] args) {
      System.out.println(div(42, 0));
    
  }
}

/*
  throw 

  The <b> throw </b> keyword allows you to manually generate exceptions from your methods. Some of the numerous available exception types include the indexOutOfBoundsException, IllegalArguementException, ArithmaticException, and so on.
  For example, we can throw an ArithmaticException in our method when the parameter is 0.
*/ 


/*
  The <b>throws </b>statement in the method definition defines the type of Exception(s) the method can throw.

  Next, the <b>throw </b>keyword throws the corresponding exception, along with a custom message.

  If we call the div method with the second parameter equal to 0, it will throw an ArithmeticException with the message "Division by Zero".
*/

/*
  Multiple exceptions can be defined in the throws statement using a comma-separated list.
*/

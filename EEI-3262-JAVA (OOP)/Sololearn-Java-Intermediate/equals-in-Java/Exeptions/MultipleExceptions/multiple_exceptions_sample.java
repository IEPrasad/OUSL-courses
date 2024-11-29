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
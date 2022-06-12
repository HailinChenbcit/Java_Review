package Day11;

public class ExceptionTest {
  public static void main (String[] args) {
    NullPointerException e = new NullPointerException("Null pointer");
//    get simple descriptive information using String arg
    String msg = e.getMessage();
    System.out.println(msg);
    
//    print exception information
    e.printStackTrace();
    System.out.println("Hello");
    try {
      System.out.println("Try this line");
//      only using exit, finally block won't be executed; exit JVM
      System.exit(0);
    } finally {
      System.out.println("This line executed");
    }
  }
}


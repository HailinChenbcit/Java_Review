package Day12;

public class MyExceptionTest {
  public static void main (String[] args) throws MyException {
//    Exception instance
    MyException e = new MyException("User name cannot be empty!");
    e.printStackTrace();
    
    String msg = e.getMessage();
    System.out.println(msg);
    
    throw new MyException("Some Exception msg");
  }
}

package Day10;

public class ExceptionTest {
  public static void main (String[] args) throws ClassNotFoundException {
//    int a = 10;
//    int b = 0;
//    int c = a / b;
//    System.out.println(c);
  
    /*
      1. Exceptions in Java belongs to Class
     */
    NumberFormatException nfe = new NumberFormatException("Number format exception!");
    System.out.println(nfe);
    
    NullPointerException npe = new NullPointerException("This is instance of NullPointerException");
    System.out.println(npe);
    
//   ArithmeticException ->(parent) RuntimeException
//    code will run
    System.out.println(10/0);
    
//    code cannot run
    ExceptionTest et = new ExceptionTest();
//    1. using throws in method signature
    et.doSome();
//    2. Using try-catch
//    try {
//      et.doSome();
//    } catch (ClassNotFoundException e) {
//      e.printStackTrace();
//    }
//    how to handle?

  
  }
  
//  ClassNotFound ->(parent) Exception
//  Compile exception, must be handled
  public void doSome() throws ClassNotFoundException{
  
  }
}

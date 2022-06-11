package Day10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest01 {
  /*
   Handle Exception:
   1. try-catch
   2. throws to anyone who wants to invoke it
   */
  public static void main (String[] args) {
    System.out.println("main begin");
    try {
      m1();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    System.out.println("main over");
  }
  
  public static void m1() throws FileNotFoundException {
    System.out.println("m1 begin");
    m2();
    System.out.println("m1 over");
  }
  
  public static void m2() throws FileNotFoundException {
    System.out.println("m2 begin");
    m3();
    System.out.println("m1 over");
  }
  
  public static void m3() throws FileNotFoundException {
    /*
      1. It invokes constructor method: FileInputStream
      2. This constructor method has: throws FileNotFoundException
      3. FileNotFoundException is during compile, (IOException-> Exception)
     */
    new FileInputStream("/Users/hailinchen/IdeaProjects/JavaReview/src/main/java/Day10/test.txt");
  }
}


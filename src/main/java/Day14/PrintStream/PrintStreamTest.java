package Day14.PrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {
  public static void main (String[] args) throws FileNotFoundException {
//    same as System.out.println
//    default output to console
    PrintStream ps = System.out;
    ps.println("hello");
  
    System.setOut(new PrintStream(new FileOutputStream("src/main/java/Day14/PrintStream/log")));
    System.out.println("Hello kitty");
    System.out.println("Hello world");
    
//    no need to close()
  }
}

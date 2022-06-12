package Day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.server.ExportException;

public class TryCatch {
  /*
    Catch multiple exceptions:
    from top down, subclass -> superclass (FileNotFound -> IOException)
    using try catch block, the next line of code can be executed;
    using throws, it ends at the line where exception occurred
   */
  public static void main (String[] args) {
    try {
      FileInputStream fis = new FileInputStream("/Users/hailinchen/IdeaProjects/JavaReview/src/main/java/Day11/test" + ".txt");
      System.out.println("Start to read file");
    } catch (FileNotFoundException | NullPointerException e) {
      System.out.println("Multiple exception declaration");
    } catch (IOException e) {
      System.out.println("Sub exception");
    } catch (Exception e){
      System.out.println("Super exception");
    }
    finally {
      System.out.println("File read ends");
    }
  }
}

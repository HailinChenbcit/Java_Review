package Day14.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOTest02 {
  public static void main (String[] args) {
    /*
    using int read(byte[] b)
      reading b.length bytes, increased efficiency
     */
    FileInputStream fis = null;
    try {
      fis = new FileInputStream("src/main/java/Day14/IOStream/test.txt");
      
      byte[] bytes = new byte[4];
      int readCount = fis.read(bytes);// the number of bytes
      System.out.println(readCount);// 4
  
      readCount = fis.read(bytes);// the number of bytes
      System.out.println(readCount);// 2
  
      readCount = fis.read(bytes);// the number of bytes
      System.out.println(readCount);// -1
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    
  }
}

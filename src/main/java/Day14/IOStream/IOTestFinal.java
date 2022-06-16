package Day14.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOTestFinal {
  public static void main (String[] args) {
    FileInputStream fis = null;
    try {
      fis = new FileInputStream("src/main/java/Day14/IOStream/test.txt");
      byte[] bytes = new byte[4];
      while (true) {
        int readCount = fis.read(bytes);
        if (readCount == -1) {
          break;
        }
        System.out.print(new String(bytes, 0, readCount));
      }
      
      
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (fis != null) {
        try {
          fis.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  
  }
}

package Day14.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
  int available(): remaining character amount in the stream
  long skip(long n): skip n bytes
 */
public class IOTest03 {
  public static void main (String[] args) {
    FileInputStream fis = null;
    try {
      fis = new FileInputStream("src/main/java/Day14/IOStream/test.txt");
//      System.out.println("All bytes amount " + fis.available());
//      byte[] bytes = new byte[fis.available()];
//      int readCount = fis.read(bytes);
////      int readByte = fis.read();// read one byte
//      System.out.println(new String(bytes));
//      System.out.println("Remaining unread bytes " + fis.available());
      
//      Using skip()
      fis.skip(3);
      System.out.println(fis.read());// 100 d
      
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

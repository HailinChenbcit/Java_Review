package Day14.IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOTest {
  public static void main (String[] args) {
    /*
        InputStream: harddisk -> memory, read
        OutputStream: memory -> harddisk, write
        
        Bytes:
        java.io.InputStream
        java.io.OutputStream
        
        Characters:
        java.io.reader
        java.io.writer
        
        All stream has close()
        All OUTPUT stream has flush(): clean the pipeline
     */
     
    /*
      java.io.FileInputStream:
      1. works for any type of files (read)
      2. using byte to read, (harddisk --> memory)
      3.
     */
    FileInputStream fis = null;
    try {
      fis = new FileInputStream("/Users/hailinchen/IdeaProjects/JavaReview/src/main/java/Day14/IOStream/test.txt");
//      int readData = fis.read();
//      System.out.println(readData);
//      readData = fis.read();
//      System.out.println(readData);
//      readData = fis.read();
//      System.out.println(readData);
//      readData = fis.read();
//      System.out.println(readData);
//
//      readData = fis.read();
//      System.out.println(readData);// -1, at the end of file
      
      
//      while (true) {
//        int data = fis.read();
//        if (data == -1) {
//          break;
//        }
//        System.out.println(data);
//      }
      
      int readData = 0;
      while ((readData = fis.read()) != -1){
        System.out.println(readData);
      }
      
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (fis != null) {
        try {
          fis.close();
        } catch (IOException e){
          e.printStackTrace();
        }
      }
    }
    
  }
}

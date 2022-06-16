package Day14.IOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
  FileReader:
    character input, only read text file
 */
public class FileReaderTest {
  public static void main (String[] args) {
    /*
      same as FileInputStream and FileOutputStream
     */
    FileReader in  = null;
    FileWriter out = null;
    try {
      in = new FileReader("src/main/java/Day14/IOStream/test.txt");
      out = new FileWriter("src/main/java/Day14/IOStream/testOutput.txt");
      
      char[] chars = new char[1024 * 1024];// 1MB
      int readCount = 0;
      while ((readCount = in.read(chars)) != -1) {
        out.write(chars, 0, readCount);
      }
      
      out.flush();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if(in != null) {
        try {
          in.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if(out != null) {
        try {
          out.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  
  }
}

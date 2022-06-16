package Day14.IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
  public static void main (String[] args) {
    /*
      Using FileInputStream + FileOutputStream to copy a file
     */
    FileInputStream fis = null;
    FileOutputStream fos = null;
    
    try {
      fis = new FileInputStream("src/main/java/Day14/IOStream/tempfile");
      fos = new FileOutputStream("src/main/java/Day14/IOStream/tempfileoutput");
      
      byte[] bytes = new byte[1024 * 1024];// 1MB
      int readCount = 0;
      while ((readCount = fis.read(bytes)) != -1) {
        fos.write(bytes, 0, readCount);
      }
      
      fos.flush();
    } catch (IOException e){
      e.printStackTrace();
    } finally {
      if (fis != null) {
        try {
          fis.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (fos != null) {
        try {
          fos.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }
}

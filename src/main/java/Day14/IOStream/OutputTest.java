package Day14.IOStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class OutputTest {
  public static void main (String[] args) {
    FileOutputStream fos = null;
    try {
//      overwrite the file if exist
//      fos = new FileOutputStream("src/main/java/Day14/IOStream/tempfile");
//      append to file
      fos = new FileOutputStream("src/main/java/Day14/IOStream/tempfile", true);
      
      byte[] bytes = {97, 98, 99, 100};
      fos.write(bytes);
      fos.write(bytes, 0, 2);
      
      String s = "Vancouver is raining";
      byte[] bs = s.getBytes(StandardCharsets.UTF_8);
      fos.write(bs);

//      flush the pipeline
      fos.flush();
    }
    catch (IOException e) {
      e.printStackTrace();
    }
    finally {
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

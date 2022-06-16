package Day14.IOBuffer;

import java.io.*;

public class BufferedReaderTest02 {
  public static void main (String[] args) throws IOException {
  
//    Byte stream
    FileInputStream in = new FileInputStream("src/main/java/Day14/IOBuffer/test");
//    Convert to character stream
    InputStreamReader reader = new InputStreamReader(in);
//    BufferedReader only accept character stream
    BufferedReader br = new BufferedReader(reader);
  
    
    
    String s = null;
    while ((s = br.readLine()) != null) {
      System.out.println(s);
    }
    
//    close the pipeline
    br.close();
  }
}

package Day14.IOBuffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
  BufferedReaderL
    no need to define byte[], it has buffer area
 */
public class BufferReaderTest {
  public static void main (String[] args) throws IOException {
    FileReader fileReader = new FileReader("src/main/java/Day14/IOBuffer/test");
    BufferedReader br = new BufferedReader(fileReader);
//    Read one line, not include '/n'
//    String firstLine = br.readLine();
//    System.out.println(firstLine);
//
//    String secondLine = br.readLine();
//    System.out.println(secondLine);
//
//    String s = br.readLine();
//    System.out.println(s);// end of file will be null

    String s = null;
    while ((s = br.readLine()) != null) {
      System.out.println(s);
    }
    
//    Need to close the outer stream, cuz it has close() for the inner stream
    br.close();
  }
}

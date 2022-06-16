package Day14.File;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {
  public static void main (String[] args) throws IOException {
    File file = new File("src/main/java/Day14/File/test");
    File file2 = new File("src/main/java/Day14/File/test");
  
    System.out.println(file.exists());
    
    if (!file.exists()) {
//      Create new file
//      file.createNewFile();
//      create new dir
//      file.mkdir();
//      create cascading dirs
//      file2.mkdirs();
    }
    
    File parentFile = new File(file.getAbsolutePath());
    parentFile.isFile();
    long time = parentFile.lastModified();// milseconds from 1970

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
    String strTime = sdf.format(new Date(time));
    System.out.println(strTime);
    
//    file size
    System.out.println(file.length());
  }
}

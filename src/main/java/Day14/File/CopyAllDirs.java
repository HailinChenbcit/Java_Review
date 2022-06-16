package Day14.File;

import java.io.File;

public class CopyAllDirs {
  public static void main (String[] args) {
    File src = new File("src/main/java/Day14");
    
    File dest = new File("src/main/java/Day14/copyFiles");
    
    copyDir(src, dest);
  }
  
  private static void copyDir(File src, File dest) {
//    if the file is a file
    if (src.isFile()) {
      return;
    }
    File[] files = src.listFiles();
//    get all flie directories
    for (File f : files) {
//      System.out.println(f.getName());
      if (f.isDirectory()) {
//        create new dir
        String srcDir = f.getAbsolutePath();
//        using String concatenation
      }
      copyDir(f, dest);
    }
  }
}

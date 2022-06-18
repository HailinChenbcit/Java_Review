package Day14.ObjectFile;


import Day3.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test1 implements Serializable {

//  customized serailzeVersion
  private static final long serialVersionUID = -42433524L;
//  JVM
  
  public static void main (String[] args) throws IOException {
    /*
      1. serialize: java Objects store in files (decompose)
      2. deserialize: from hard disk to reunite all data into java Objects
      
      3. serialize multiple objects: put objects into Arraylist
      
      4. using transient keyword to make member variable not being serialized
      
      5. Why serialization?
        If the source code changed, class file will generate a version (serialVersionUID)
        If two people has same named class, they will have two serialVersion, to be distinguished
        
        However, we cannot change src code, cuz the auto-generated new version
        
        
     */
//    Class must implements Serializable
    Student s = new Student();
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("animals"));
    
    oos.writeObject(s);
    
    oos.flush();
    oos.close();
  }
}

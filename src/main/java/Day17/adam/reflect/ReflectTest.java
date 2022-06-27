package Day17.adam.reflect;

import java.lang.reflect.Field;

public class ReflectTest {
  public static void main (String[] args) throws Exception{
//    reflect attribute Field
    Class stuClass = Class.forName("Day17.adam.reflect.Stu");
//    get All fileds in the class
    Field[] fields = stuClass.getFields();
    System.out.println(fields.length);// 1
    
    Field f = fields[0];// no (public)
    System.out.println(f.getName());
  
    Field[] fs = stuClass.getDeclaredFields();
    System.out.println(fs.length);// 4
//    Iteration
    for(Field field : fs) {
      System.out.println("Complete name: "+ field.getName() + "=>" + field.getType());
      System.out.println("Simple name: "+ field.getType().getSimpleName());
  
      System.out.println(field.getModifiers());// return int
      
    }
    
  }
}

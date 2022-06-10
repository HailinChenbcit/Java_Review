package Day10.adam.Annotation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationTest {
  public static void main (String[] args) throws InvocationTargetException, IllegalAccessException {
    @SuppressWarnings("unused")
    Cat myCat = new Cat("Poke");
  
    if (myCat.getClass().isAnnotationPresent(VeryImportant.class)) {
      System.out.println("This is very important");
    } else {
      System.out.println("This is not important");
    }
    
    for (Method method: myCat.getClass().getDeclaredMethods()){
      if (method.isAnnotationPresent(RunImmediately.class)){
        RunImmediately annotation = method.getAnnotation(RunImmediately.class);
        for (int i =0; i< annotation.times(); i++){
          method.invoke(myCat);
        }
      }
    }
    
    for (Field filed: myCat.getClass().getDeclaredFields()){
      if(filed.isAnnotationPresent(ImportantString.class)){
        Object obj = filed.get(myCat);
        
        if (obj instanceof String stringValue) {
          System.out.println(stringValue.toUpperCase());
        }
      }
    }
  }
}

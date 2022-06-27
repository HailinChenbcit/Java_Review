package Day16.Reflection;

import java.io.FileReader;
import java.util.Properties;

public class ReflectTest03 {
  public static void main (String[] args) throws Exception {
	FileReader reader = new FileReader("src/main/java/Day16/Reflection/info.properties");
	Properties pro = new Properties();
	pro.load(reader);
	reader.close();
	
	String className = pro.getProperty("className");
	System.out.println(className);
	
//	Using reflect instantiate object
//	More flexible, we can change properties file to create various classes
	Class c = Class.forName(className);
	Object obj = c.newInstance();
	System.out.println(obj);
  }
}

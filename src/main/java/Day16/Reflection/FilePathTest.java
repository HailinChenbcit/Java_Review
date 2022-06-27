package Day16.Reflection;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FilePathTest {
  public static void main (String[] args) throws FileNotFoundException {
//	FileReader reader = new FileReader("./info.properties");
	
//	当前线程的类加载器对象，默认从跟路径下加载, file path
//	Adaptable to different OS, IDE
	String path = Thread.currentThread().getContextClassLoader().
			getResource("classinfo2.properties").getPath();
	System.out.println(path);
	
//	get absolute path, from src
	String path2 = Thread.currentThread().getContextClassLoader().
			getResource("main/java/Day16/Reflection/info.properties").getPath();
	System.out.println(path2);
 
//	Using stream
	InputStream reader = Thread.currentThread().getContextClassLoader()
								 .getResourceAsStream("classinfo2.properties");
	Properties pro = new Properties();
	try {
	  pro.load(reader);
	} catch (IOException e) {
	  e.printStackTrace();
	}
	String className = pro.getProperty("className");
	System.out.println(className);
  }
}

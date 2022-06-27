package Day16.ResourceBundle;

import java.util.ResourceBundle;

public class ResourceTest {
  /*
    config files must have .properties AND in class path (under src )
    JDK has three class loader:
      1. 启动类: rt.jar
      2. 扩展类: ext/*.jar
      3. 应用类: classpath
     
      双亲委派机制，根据1～3加载类
   */
  public static void main (String[] args) {
    ResourceBundle bundle = ResourceBundle.getBundle("classinfo2");
    String name = bundle.getString("className");
    System.out.println(name);
    
  }
}

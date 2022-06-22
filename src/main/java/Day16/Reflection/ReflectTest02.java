package Day16.Reflection;

public class ReflectTest02 {
  public static void main (String[] args) {
    try {
//      Use reflect instantiate object
      Class c = Class.forName("Day16.Reflection.User");
      Object obj = c.newInstance();
      System.out.println(obj);
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
      e.printStackTrace();
    }
  }
}

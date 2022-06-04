package Day4;

public class InstanceBlock {
  /*
    Instance block executed before constructor method,
    This is Object constructing time
   */
  public static void main (String[] args) {
    System.out.println("Main begin");
    new InstanceBlock();
  }
  
  {
    System.out.println("Instance block executed");
  }
  public InstanceBlock(){
    System.out.println("Non-arg constructor executed");
  }
}

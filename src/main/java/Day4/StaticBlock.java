package Day4;

public class StaticBlock {
/*  Static block/ Static variable
  1. Executing when class loading, and only execute once
  2. Executing before main()
  3. From top down
  4. Example: log info (the datetime of Class loading)
  5. Order by top -> down
*/
  static int i = 100;
  int k = 10;
  static {
    System.out.println("A");
    System.out.println(i);
//    System.out.println(k);// instance variable, should wait for main() loading then can be accessed
  }
  static {
    System.out.println("B");
  }
  
  public static void main (String[] args) {
    System.out.println("Hello World");
  }
  
  static {
    System.out.println("C");
  }
  
}



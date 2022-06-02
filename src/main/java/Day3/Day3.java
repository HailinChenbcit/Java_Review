package Day3;

public class Day3 {
  public static void main (String[] args) {
    double x = totalCost(1, 1);
    System.out.println(x);
    printHello();
  }
  
  public static int totalCost(int a, int b) {
    // Automatic widening conversion
    return a + b;
  }
  
  public static void printHello() {
    System.out.println("Hello");
  }
  /*
   * No return statement, will not compile
   */
//  public static int m() {
//    boolean flag = true;
//    if (flag) {
//      return 1;
//    }
//  }
  /*
    correction
   */
//    public static int m() {
//    boolean flag = true;
//    if (flag) {
//      return 1;
//    }
//    return 0;
//  }
  /*
  ternary
   */
    public static int m(boolean flag) {
      return flag ? 1: 0;
  }
}

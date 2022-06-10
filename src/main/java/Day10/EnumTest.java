package Day10;

public class EnumTest {
  public static void main (String[] args) {
    Result r = divide(10, 0);
    System.out.println(r == Result.SUCCESS ? "success" : "fail");
  }
  
  /**
   *
   * @param a int
   * @param b int
   * @return Result.SUCCESS
   */
  public static Result divide(int a, int b){
    try {
      int c = a / b;
      return Result.SUCCESS;
    } catch (Exception e) {
      return Result.FAIL;
    }
  }
}

enum Result {
  SUCCESS, FAIL
}
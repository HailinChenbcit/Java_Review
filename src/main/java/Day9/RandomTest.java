package Day9;

import java.util.Random;

public class RandomTest {
  public static void main (String[] args) {
    Random random = new Random();
//    any number in range of int
    int num1 = random.nextInt();
    System.out.println(num1);
    
//    random num between [0, 101)
    int num2 = random.nextInt(101);
    System.out.println(num2);
  }
}

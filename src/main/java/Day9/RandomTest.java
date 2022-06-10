package Day9;

import java.util.Arrays;
import java.util.Random;

public class RandomTest {
  public static void main (String[] args) {
//    Random random = new Random();
//    any number in range of int
//    int num1 = random.nextInt();
//    System.out.println(num1);
    
//    random num between [0, 101)
//    int num2 = random.nextInt(101);
//    System.out.println(num2);
    
//    Generate 5 non-repeat random num in [0,100] then append toan array
    Random random = new Random();
    int[] arr = new int[5];
//    initialize arr with default value -1
//    for(int i = 0; i < arr.length; i++) {
//      arr[i] = -1;
//    }
    Arrays.fill(arr, -1);
    
//    generate random numbers in [0, 5]
    int index = 0;
    while (index < arr.length) {
      int num = random.nextInt(6);
      if (!contains(arr, num)) {
        arr[index++] = num;
      }
    }
    for (int i : arr) {
      System.out.println(i);
    }
  }
  
  /**
   *
   * @param arr arraylist
   * @param key index of element in the array
   * @return a boolean value, true represents contains repeated number
   */
  public static boolean contains(int[] arr, int key) {
//    Binary search will affect original array
//    Arrays.sort(arr);
//    return Arrays.binarySearch(arr, key) >= 0;
    for (int element : arr) {
      if (element == key) {
        return true;
      }
    }
    return false;
  }
}

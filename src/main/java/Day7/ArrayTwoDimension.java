package Day7;

import java.util.Arrays;

public class ArrayTwoDimension {
  public static void main (String[] args) {
    int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
    
    int[][] arr = new int[3][3];
  
    for (int[] ints : arr) {
//      System.out.println(Arrays.toString(arr[i]));
      for (int j : ints) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}


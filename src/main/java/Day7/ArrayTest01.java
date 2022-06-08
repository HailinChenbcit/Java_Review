package Day7;

/**
 * 1-dimension array with reference data
 */
public class ArrayTest01 {
  public static void main (String[] args) {
    Animal a1 = new Animal();
    Animal a2 = new Animal();
    Animal[] animals = {a1, a2};
  
//    iterate array
    for (Animal animal : animals) {
      animal.move();
    }
    
/*  expand array space
    create larger array, and copy original to the new larger array
*/
    int[] src = {1, 2, 3, 5, 7};
    int[] dest = new int[20];
//    copy addresses
    System.arraycopy(src, 1, dest, 3, 2);
    for (int j : dest) {
      System.out.println(j);
    }
  }
}

class Animal {
  public void move(){
    System.out.println("animal is moving....");
  }
}
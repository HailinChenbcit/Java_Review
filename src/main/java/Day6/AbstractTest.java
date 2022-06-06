package Day6;

public class AbstractTest {
  public static void main (String[] args) {
  
  }
}

/*
  if the non-abstract class extends abstract class, child class needs override abstract
  method from parent class;
  if abstract class extends abstract class, doesn't have to be overridden
 */
abstract class Animal {
  public abstract void move();
}

class Bird extends Animal {
//  Override abstract method in parent class
  public void move(){};
}
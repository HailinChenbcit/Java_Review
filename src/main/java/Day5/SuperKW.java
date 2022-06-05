package Day5;

/**
 * super:
 * 1. Can be used in instance method and constructor method
 * 2. super./ super()
 * 3. Cannot be used in static method
 * 4. Can be omitted, except for:
 *    same attribute in both parent class and child class (same method), access parent from child
 * 5. super() only in the first line of constructor method, to access Parent class's constructor method
 * 6. if constructor first line doesn't have this or super, it contains super() by default
 * 7. this() is current constructor method; super() is parent's constructor method
 */
public class SuperKW {
  public static void main (String[] args) {
    new B1();// Parent class will be constructed first (Need egg to hatch chicken)
  }
}

class A1 {
  public A1() {
    System.out.println("A1 non-arg constructor");
  }
  
}

class B1 extends A1 {
  public B1() {
    System.out.println("B1 non-arg constructor");
  }
  
}
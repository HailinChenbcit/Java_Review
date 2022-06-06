package Day6;

public class InterfaceAndClass {
  public static void main (String[] args) {
  
  }
}

interface MyMath1 {
  double PI = 3.14;
  public int sum(int a, int b);
}

/*
  1. class implements interface
  2. non-abstract class implements interface, must override all abstract methods
      in the interface
  3. class Child extends Parent implements Interface{}
  
 */
class MyMathImp implements MyMath1 {
  /*
    Either override methods in MyMath1,
    Or make MyMathImp abstract
   */
  public int sum(int a, int b){ return a + b;};
}
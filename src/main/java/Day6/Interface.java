package Day6;

public class Interface {
  public static void main (String[] args) {
    System.out.println(MyMath.PI);
  }
}

/*
  Interface:
  1. reference type
  2. Interface is abstract type (totally abstract)
  3. interface will generate bytecode file after compiled
  4. interface support multiple inheritance
  5. interface contains two parts: constant, abstract method
  6. interface doesn't have constructor method
 */

interface A {

}

interface B {}

interface CC extends A, B{}

interface MyMath {
//  public static final can be omitted
  public static final double PI = 3.1415;
  
//  public abstract can be omitted
  public abstract int sum(int a, int b);
  
//  method cannot have body
//  public int divide () {}
}
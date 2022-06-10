package Day6;

public class FinalTest {
  public static void main (String[] args) {
//    final int k = 100;
//    k = 300;
//    System.out.println(k);
    Person p1 = new Person(20);
    System.out.println(p1.age);
    
    final Person p = new Person(30);
//    member can be changed
    System.out.println(p.age);
    p.age = 50;
    System.out.println(p.age);
  }
}

/*
  final:
  1. unchangeable
  2. can be used for variable, method, and class
  3. final class cannot be extended
  4. final method cannot be overridden
  5. final variable cannot be re-assign value
  6. instance variable must be assigned value in constructor method/ initialize
     with certain value, cuz no default value
  7. static final is CONSTANT,using all Cap letters and underscore
 */


//final class A {
//
//}

// cannot extend from final class
//class B extends A {
//
//}

class Person {
  int age;
  public Person() {}
  public Person(int age) {
    this.age = age;
  }
}

class User {
  final double height = 1.8;
  final double weight;
  static final String SEX = "male";// use static to make it static variable
  
//  public User() {
//    this.weight = 90;
//  }
  
  public User(double d) {
    this.weight = d;
  }
}


class C {
  public final void doSome(){
    System.out.println("C");
  }
}

class D extends C {
//  public void doSome(){
//    System.out.println("D");
//  }
}
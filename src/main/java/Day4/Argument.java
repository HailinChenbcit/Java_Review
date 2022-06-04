package Day4;

public class Argument {
  public static void main (String[] args) {
    Person p = new Person();
    p.age = 10;
    add(p);
    System.out.println(p.age);// 11
  }
//  Pass by value (this value could be number or reference)
//  copy the "value" then pass
//  Two variables point to the same object in the heap
  public static void add(Person p) {
    p.age++;
    System.out.println(p.age);// 11
  }
}

class Person {
  int age;
}
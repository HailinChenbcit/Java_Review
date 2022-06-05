package Day4;

public class ExtendsTest01 {
  public static void main (String[] args) {
    Cat cat = new Cat();
//    cat.move();
//    System.out.println(cat.name);
    System.out.println(cat);
  }
}

class Animal {
  String name = "Meow";
  public void move() {
    System.out.println(name + " is moving");
  }
  
  @Override
  public String toString () {
    return "Animal{" +
                   "name='" + name + '\'' +
                   '}';
  }
}

class Cat extends Animal {

}
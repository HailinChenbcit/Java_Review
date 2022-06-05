package Day5;

public class Polymorphism {
  public static void main (String[] args) {
    /*
      1. up-casting: child -> parent (automatic)
      2. down-casting: parent -> child
      ** Only when two classes have inheritance relationship
      
      Polymorphism:
      Parent Class reference point to Child instance
      Compile: static binding Parent class method
      Interpreting: dynamically binding to Child instance method
     */
//    Up-casting
    Animal a1 = new Cat();
    Animal a2 = new Bird();
    
    a1.move();
    a2.move();
    
    Animal a3 = new Cat();
//    a3.catchMice();// Cannot compile, no such method in the parent Class

//    down-casting
    Cat x = (Cat) a3;
    x.catchMice();
    
//    It may cause ClassCastException
//    Animal a4 = new Bird();
//    Cat y = (Cat) a4;

//    instanceof
//    when using down-casting, must use instanceof to identify class
    Animal a4 = new Bird();
    if (a4 instanceof Cat) {
      Cat y = (Cat) a4;
      y.catchMice();
    } else {
      System.out.println("This creature is not a Kitty Cat");
    }
  
  }
}

class Cat extends Animal{
  @java.lang.Override
  public void move(){
    System.out.println("Cat is jogging");
  }
  
  public void catchMice(){
    System.out.println("Catching mouse");
  }
}
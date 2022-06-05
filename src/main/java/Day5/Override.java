package Day5;

public class Override {
  /*
    Method Override:
    1. Two class has relationship (extends)
    2. Override method has: same return type/ method name/ args(num, type)
    3. Access privilege cannot be lower (public > protected > private)
    4. Throw less exceptions than original method
    
    * private method cannot be overridden
    * Constructor method cannot be inherited, cannot be overridden
    * Method override only works for instance method
   */
  public static void main (String[] args) {
    Animal a = new Animal();
    Bird b = new Bird();
    
    a.move();
    b.move();
  }
}

class Animal {
  public void move(){
    System.out.println("Animal is moving ");
  }
}

class Bird extends Animal {
//  override some  from parent class
  @java.lang.Override
  public void move(){
    System.out.println("Bird is flying");
  }
}

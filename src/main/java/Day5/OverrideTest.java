package Day5;

public class OverrideTest {
  public static void main (String[] args) {
//    Static method doesn't exist override
    A a = new A();
    a.doSome();
    A b = new B();
    b.doSome();
  
//    A.doSome();
//    B.doSome();
  
//    a.doOther();
//    b.doOther();
  }
}

class A {
  public static void doSome() {
    System.out.println("A static method executed");
  }
  private void doOther() {
    System.out.println("A private method executed");
  }
}

class B extends A {
  public static void doSome() {
    System.out.println("B static method executed");
  }
  
//  Cannot override the private Parent method
  public void doOther() {
    System.out.println("B private method executed");
  }
}
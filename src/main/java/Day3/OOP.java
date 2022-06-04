package Day3;

public class OOP {
  A o1;
  public static void main (String[] args) {
    /*
    OOP
    encapsulation
    inheritance
    polymorphism
   */
  /*
    instantiate object
    This instance variable, instantiated in heap
    local variable in stack (reference)
   */
//    Student student = new Student();
    C c = new C();
    B b = new B();
    A a = new A();
    OOP t = new OOP();
    
    b.o3 = c;
    a.o2 = b;
    t.o1 = a;
  
    System.out.println(c.i);
    System.out.println(t.o1.o2.o3.i); // default value
    
//    NullPointerException
//    GC: heap
    C c1;
    c1= null;
    System.out.println(c1.i);
  }
}

class A {
  B o2;
}

class B {
  C o3;
}

class C {
  int i;
}


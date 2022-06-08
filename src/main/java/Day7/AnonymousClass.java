package Day7;

public class AnonymousClass {
  public static void main (String[] args) {
    MyMath mm = new MyMath();
//    Anonymous inner class
    mm.mySum(new Compute(){
      public int sum(int a, int b) {
        return a + b;
      }
    }, 100, 200);
  }
}

class Test01 {
  static class Inner1{
  
  }
  class Inner2{
  
  }
  
  public void doSome(){
    int i = 100;
    class inner3{
    
    }
  }
  
  public void doOther(){
  
  }
}

interface Compute{
//  abstract method
  int sum(int a, int b);
}

// auto implementation of interface
//class ComputeImpl implements Compute {
//  public int sum(int a, int b){
//    return a + b;
//  }
//}

class MyMath{
  public void mySum(Compute c, int x, int y){
    int retValue = c.sum(x, y);
    System.out.println(retValue);
  }
}
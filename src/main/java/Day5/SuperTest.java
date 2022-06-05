package Day5;

public class SuperTest {
  public static void main (String[] args) {
    new Three();// 1 3 6 5 4

  }
}

class One {
  String name;
  public One(){
    System.out.println("1");
  }
}

class Two extends One {
  String name;
  
  public Two(){
    System.out.println("2");
  }
  public Two(String name){
//    super(); by default
    System.out.println("3");
  }
}

class Three extends Two {
  public Three(){
    this("Adam");
    System.out.println("4");
  }
  public Three(String name){
    this(name, 20);
    System.out.println("5");
  }
  public Three(String name, int age){
    super(name);
    System.out.println("6");
  }
}
package Day5;

public class Test3 {
  public static void main (String[] args) {
    Chinese cn = new Chinese();
    cn.setName("CN");
    cn.speak();
    
    American am = new American();
    am.setName("USA");
    am.speak();
  }
}

class People {
  private String name;
  public People() {}
  
  public People (String name) {
    this.name = name;
  }
  
  public String getName () {
    return name;
  }
  
  public void setName (String name) {
    this.name = name;
  }
  
  public void speak() {
    System.out.println(name + " is speaking...");
  }
}

class Chinese extends People {
  
  public void speak() {
    System.out.println(this.getName() + " is speaking Mandarin");
  }
}

class American extends People {
  public void speak() {
    System.out.println(this.getName() + " is speaking English");
  }
}
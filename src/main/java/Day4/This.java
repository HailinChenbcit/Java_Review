package Day4;

/*
  1. this used in instance method, cannot be used in static method
  2. In instance method/ constructor method, to identify local variable and instance variable,
      this cannot be omitted.
 */
public class This {
  public static void main (String[] args) {
    Students s = new Students();
    s.setName("AA");
    s.setNo(111);
    System.out.println(s.getName() + s.getNo());
    
    Students s2 = new Students(112, "BB");
    
  }
}

class Students {
  private int no;
  private String name;
  
  public Students() {}
  
//  public Students(int i, String s) {
//    no = i;
//    name = s;
//  }

//  Using this keyword
  public Students (int no, String name) {
    this.no = no;
    this.name = name;
  }
  
  public int getNo () {
    return no;
  }
  
  public void setNo (int no) {
    this.no = no; // this: identify local variable and instance variable
  }
  
  public String getName () {
    return name; // == this.name, but can be omitted
  }
  
  public void setName (String name) {
    this.name = name;
  }
  
}

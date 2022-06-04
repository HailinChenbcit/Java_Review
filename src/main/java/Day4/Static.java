package Day4;

public class Static {
  public static void main (String[] args) {
    Persons p1 = new Persons("123", "AA");
    Persons p2 = new Persons("321", "BB");
  
//    Access static variable
    System.out.println(Persons.nationality);
//    Access instance reference
    System.out.println(p1.id);
    System.out.println(p2.name);
//    try to access null reference
    p1 = null;
    System.out.println(p1.nationality);// can access but still using Class.nationality to retrieve
    System.out.println(p1.id);
  }
}

class Persons {
  String id;
  String name;
  static String nationality = "CA"; // save memory; represents characteristic of the whole class
  
  public Persons(){}
  
  public Persons (String id, String name) {
    this.id = id;
    this.name = name;
  }
  
}
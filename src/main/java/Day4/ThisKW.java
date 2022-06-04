package Day4;

public class ThisKW {
  public static void main (String[] args) {
    Customer c = new Customer("SP");
    c.shopping();
  }
}

/*
  this keyword store the reference pointing to the object in the heap (within this object)
  this can be ONLY used in instance method, static method doesn't need instance
 */
class Customer {
  String name;
  
  public Customer() {
  
  }
  
  public Customer( String s) {
    name = s;
  }
  
  public void shopping() {
    System.out.println(this.name + " is shopping now");
  }
}
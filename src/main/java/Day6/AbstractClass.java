package Day6;

public class AbstractClass {
  public static void main (String[] args) {
//    Account act = new Account();// cannot be instantiate
    Account bank = new RBC();
  }
}

/*
  Abstract Class:
  1. Abstract common characteristics from different classes.
  2. It is reference type
  3. Abstract class: is a restricted class that cannot be used to create objects
     (to access it, it must be inherited from another class)
  4. abstract and final cannot appear together
  5. abstract class has constructor method for child class
  6. abstract method: has no method body; has abstract keyword
  7. abstract method only exist in abstract class
  
 */

abstract class Account {

}

abstract class BankAccount extends Account {
  public BankAccount(){}
  public BankAccount(String name) {}
}

class RBC extends BankAccount {
  public RBC() {
    super();
  }
}
package Day4;

public class ExtendsTest {
  public static void main (String[] args) {
  
  }
}

class Account {
  private String no;
  private double balance;
  
  public Account() {
  
  }
  
  public Account (String no, double balance) {
    this.no = no;
    this.balance = balance;
  }
  
  public String getNo () {
    return no;
  }
  
  public void setNo (String no) {
    this.no = no;
  }
  
  public double getBalance () {
    return balance;
  }
  
  public void setBalance (double balance) {
    this.balance = balance;
  }
}

// Inheritance from Account
/*
  inherit everything except for constructor method
  Private attributes cannot be accessed directly in the child class
  If extends Object class by default
  coupling increased
 */
class CreditAccount extends Account {
  private double credit;
  
  public CreditAccount(){
  
  }
  
  public CreditAccount (double credit) {
    this.credit = credit;
  }
  
  public CreditAccount (String no, double balance, double credit) {
    super(no, balance);
    this.credit = credit;
  }
  
  public double getCredit () {
    return credit;
  }
  
  public void setCredit (double credit) {
    this.credit = credit;
  }
}

//class CreditAccount {
//  private String no;
//  private double balance;
//  private double credit;
//
//  public CreditAccount(){}
//
//  public CreditAccount (String no, double balance, double credit) {
//    this.no = no;
//    this.balance = balance;
//    this.credit = credit;
//  }
//
//  public String getNo () {
//    return no;
//  }
//
//  public void setNo (String no) {
//    this.no = no;
//  }
//
//  public double getBalance () {
//    return balance;
//  }
//
//  public void setBalance (double balance) {
//    this.balance = balance;
//  }
//
//  public double getCredit () {
//    return credit;
//  }
//
//  public void setCredit (double credit) {
//    this.credit = credit;
//  }
//}
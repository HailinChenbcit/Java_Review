package Day16.Thread;

public class Account {
  private String actno;
  private double balance;
  
  public Account (String actno, double balance) {
	this.actno = actno;
	this.balance = balance;
  }
  
  public String getActno () {
	return actno;
  }
  
  public void setActno (String actno) {
	this.actno = actno;
  }
  
  public double getBalance () {
	return balance;
  }
  
  public void setBalance (double balance) {
	this.balance = balance;
  }
  
  public void withdraw(double money) {
	/*
		make the data not concurrent, but lining up to be executed
		Account object(this) is the shared object
		
		Object in the lockpool, and wait for any object who occupied the object lock
	 */
	synchronized (this){
	  double before = this.getBalance();
	  double after = before - money;
	  try {
		Thread.sleep(1000);
	  } catch (InterruptedException e) {
		e.printStackTrace();
	  }
	  this.setBalance(after);
	}
	
  }
}

package Day16.Thread;

public class AccountThread extends Thread{
//  Two thread share one account object
  
  private Account act;
  
  public AccountThread(Account act) {
	this.act = act;
  }
  
  @Override
  public void run () {
	double money = 5000;
	act.withdraw(money);
 
	System.out.println(Thread.currentThread().getName() + ": " + act.getActno() + " withdraw successfully, remaining "
							   + act.getBalance());
  }
}

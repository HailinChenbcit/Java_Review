package Day16.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class FutureTaskTest {
  public static void main (String[] args) {
	FutureTask futureTask = new FutureTask(new Callable() {
	  @Override
	  public Object call () throws Exception {
		System.out.println("call method begin");
		Thread.sleep(1000 * 5);
		System.out.println("call method end");
		return new Object();
	  }
	});
	
  }
}

package Day16.Thread;

public class ThreadTest03 {
  public static void main (String[] args) {
	/*
		daemon thread
	 */
	Thread t = new BakDataThread();
	t.setName("BakThread");
//	Make thread to daemon thread
//	It will end automatically after user thread(main) ended
	t.setDaemon(true);
	t.start();
	
	for (int i = 0; i < 10; i++) {
	  System.out.println(Thread.currentThread().getName() + " ==> " + i);
	  try {
		Thread.sleep(1000);
	  } catch (InterruptedException e) {
		e.printStackTrace();
	  }
	  
	}
  }
}

class BakDataThread extends Thread {
  public void run() {
	int i = 0;
	while (true) {
	  System.out.println(Thread.currentThread().getName() + " ==> " + (++i));
	  try {
		Thread.sleep(1000);
	  } catch (InterruptedException e) {
		e.printStackTrace();
	  }
	}
  }
}
package Day16.Thread;

import java.util.ArrayList;
import java.util.List;

public class NotifyAndWaitTest {
  public static void main (String[] args) {
	/*
		producer/consumer
		
		wait() notify() is on synchronized thread
		obj.wait():
			make current thread on obj to wait state, and release the object lock on o
		obj.notify()
			will not release object lock on o, only notify
	 */
//	One shared repository, only one item is allowed
	List list = new ArrayList();
	
	Thread t1 = new Thread(new Producer(list));
	Thread t2 = new Thread(new Consumer(list));
	
	t1.setName("Producer_Thread");
	t2.setName("Consumer_Thread");
	
	t1.start();
	t2.start();
	
  }
}

class Producer implements Runnable{
  private List list;
  public Producer(List list){
	this.list = list;
  }
  @Override
  public void run () {
	while (true) {
//	  add object lock
	  synchronized (list) {
		if(list.size() > 0) {
		  try {
			list.wait();
		  } catch (InterruptedException e) {
		  
		  }
		}
		Object obj = new Object();
		list.add(obj);
		System.out.println(Thread.currentThread().getName() + "--->" + obj);
//		wake the consumer
		list.notify();
	  }
	}
  }
}

class Consumer implements Runnable{
  private List list;
  
  public Consumer(List list){
	this.list = list;
  }
  @Override
  public void run () {
	while (true){
	  synchronized (list){
		if(list.size() == 0) {
		  try {
			list.wait();
		  } catch (InterruptedException e) {
			e.printStackTrace();
		  }
		}
		Object obj = list.remove(0);
		System.out.println(Thread.currentThread().getName() + "--->" + obj);
//		wake the producer
		list.notifyAll();
	  }
	}
  }
}
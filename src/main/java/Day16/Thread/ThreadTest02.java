package Day16.Thread;

public class ThreadTest02 {
  public static void main (String[] args) {
    /*
      Thread blocking state:
      Thread.sleep() method:
        static method, make currentThread sleep
       
     */
//    try {
//      Thread.sleep(1000 * 3);
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }
//    System.out.println("Hello in three seconds later!");

//    Thread t = new Thread(() -> System.out.println("this thread !"));
//    t.start();

//    for (int i = 0; i < 10; i++) {
//      System.out.println(Thread.currentThread().getName() + "==>" + i);
//      try {
//        Thread.sleep(1000);
//      } catch (InterruptedException e) {
//        e.printStackTrace();
//      }
//    }
//    MyThread3 t = new MyThread3();
//    t.setName("t");
//    t.start();
//
//    try {
//      Thread.sleep(1000 * 5);
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }
    
    
    /*
      stop sleep
     */
//    Thread t = new Thread(new MyRunnable2());
//    t.setName("MyThread");
//    t.start();
//    try {
//      Thread.sleep(1000 * 3);
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }
//    using java Exception handling
//    t.interrupt();// java.lang.InterruptedException


//    how to force stop a thread
//    Thread t = new Thread(new MyRunnable2());
//    t.setName("MyThread");
//    t.start();
//    try {
//      Thread.sleep(1000 * 3);
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }
////    force stop (kill thread), but unsaved data will be lost
//    t.stop();
    
//  Using boolean flag to end thread
    MyRunnable2 r = new MyRunnable2();
    Thread t = new Thread(r);
    t.setName("MyThread");
    t.start();
    try {
      Thread.sleep(1000 * 3);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
//  thread priority
    System.out.println(Thread.MAX_PRIORITY);
    System.out.println(Thread.NORM_PRIORITY);
    System.out.println(Thread.MIN_PRIORITY);
    System.out.println("Current thread priority: " + t.getPriority());
//    set new thread priority
//    Thread.currentThread().setPriority(1);
    System.out.println("Updated thread priority: " + t.getPriority());
  
    r.run = false;
  }
}

class MyThread3 extends Thread{
  @Override
//  run() method parent Class doesn't throw any exception, child class cannot throw more
//  exceptions than parent class
  public void run () {
//    for (int i = 0; i < 1000; i++) {
//      System.out.println(Thread.currentThread().getName() + " ==> " + i);
//    }
  }
}

class MyRunnable2 implements Runnable{
  boolean run = true;
  
  @Override
  public void run () {
    if (run) {
      System.out.println(Thread.currentThread().getName() + " ===> begin");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + " ===> end");
    } else {
      return;
    }
  }
}

package Day14.Concurrent;

public class MultiThreadTest {
  public static void main (String[] args) {
    /*
      process: an application
      thread: a single unit in one process
      
      multi-thread: share heap and method memory
      
      How to implement multi-thread?
      1. a class extends java.lang.Thread, overwrite run() method
      2.
     */
    MyThread myThread = new MyThread();
//    start thread
//    myThread.run();

//    start thread, open JVM stack space, then over
    myThread.start();
//    still in the main stack
    for (int i=0; i<10; i++) {
      System.out.println("Main thread ==> " + i);
    }
    
  }
}


class MyThread extends Thread {
  @Override
  public void run () {
    for (int i=0; i<10; i++) {
      System.out.println("Subthread ==> " + i + " is running");
    }
  }
}
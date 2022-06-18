package Day15.Concurrent;

public class MultiThreadTest {
  public static void main (String[] args) {
    /*
      1. class extends java.lang.Thread, overwrite run() method
      2. class implement java.lang.Runnable
     */
    
//    MyThread thread = new MyThread();
//    start thread: start a sub thread and open new sub-stack in JVM
//    If success, auto invoke run() method, and push to stack
//    thread.start();
//    run will not open new stack, this way is single-thread
//    thread.run();
//    for (int i = 0; i < 100; i++) {
//      System.out.println("MainThread ==> " + i);
//    }
  
    Thread t = new Thread(new MyRunnable());
    t.start();
    for (int i = 0; i < 100; i++) {
      System.out.println("MainThread ==> " + i);
    }
  
  }
}

class MyThread extends Thread {
  @Override
  public void run () {
    for (int i = 0; i < 1000; i++) {
      System.out.println("SubThread ==> " + i);
    }
  }
}

class MyRunnable implements Runnable {
  @Override
  public void run () {
    for (int i = 0; i < 1000; i++) {
      System.out.println("SubThread ==> " + i);
    }
  }
}
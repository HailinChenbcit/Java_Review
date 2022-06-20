package Day16.Thread;

public class ThreadTest {
  public static void main (String[] args) {
    /*
      1. get current thread object:
      2. get thread name: thread.getName()
      3. set thread name: thread.setName()
      4. Default name: Thread-0, Thread-1, ...
      
     */
//    currentThread is current thread object
    Thread thread = Thread.currentThread();
    System.out.println(thread.getName());

    MyThread2 t = new MyThread2();
    String name = t.getName();
    System.out.println(name);
    
    MyThread2 t2 = new MyThread2();
    t2.setName("t2");
    String name2 = t2.getName();
    System.out.println(name2);
  
    t.start();
    t2.start();
  }
}

class MyThread2 extends Thread {
  @Override
  public void run () {
    for (int i = 0; i < 100; i++) {
      Thread currentThread = Thread.currentThread();
      System.out.println(currentThread.getName() + " ==> " + i);
//      System.out.println(this.getName() + " ==> " + i);
    }
  }
}
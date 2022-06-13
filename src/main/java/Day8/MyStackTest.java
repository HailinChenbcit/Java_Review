package Day8;

import Day12.MyException;

public class MyStackTest {
  public static void main (String[] args) {
    MyStack stack = new MyStack();
//    Catch customized exception when calling the function
    try {
      stack.push(new Object());
    } catch (MyException e) {
      e.printStackTrace();
    }
  }
}

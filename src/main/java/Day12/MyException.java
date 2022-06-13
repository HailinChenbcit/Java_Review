package Day12;

public class MyException extends Exception {
  /*
    1. extends Exception: 编译时异常，不是发生在compile阶段，但是必须handle
    2. extends RuntimeException: 运行时异常，不必要handle
   */
  
  public MyException () {
  }
  
  public MyException (String s) {
    super(s);
  }
}



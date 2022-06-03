package Day3;

public class JVM {
  public static void main (String[] args) {
  
  }
//  Overload
/*  1. in the same class;
    2. Same method name;
    3. Different arguments (order, quantity, type)
*/
  public static int sum(int a, int b) {
    return a + b;
  }
  public static long sum(long a, long b) {
    return a + b;
  }
  public static double sum(double a, double b) {
    return a + b;
  }
  
}

class JVMStructure{
  /*
   * Stack, new space when method invoked
   * Heap, methods
   * Method, classloader, store .class bytecode
   */
  /*
  Stack: push and pop, FILO, high address -> low address
  stack frame:
  栈是从高地址向低地址延伸的。每个函数的每次调用，都有它自己独立的一个栈帧，这个栈帧中维持着所需要的各种信息。
  寄存器ebp指向当前的栈帧的底部（高地址），寄存器esp指向当前的栈帧的顶部（低地址）。
   */
}



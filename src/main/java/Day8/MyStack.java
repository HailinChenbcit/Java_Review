package Day8;

public class MyStack {
  private Object[] elements;
  private int index;
  
  public MyStack() {
    this.elements = new Object[10];// initial with size 10
    this.index = -1;
  }
  
  /**
   *  push objects to stack
   * @param obj
   */
  public void push(Object obj) {
    if (this.index >= this.elements.length - 1) {
      System.out.println("Stack full!");
      return;
    }
    this.index++;
    this.elements[index] = obj;
    System.out.println("Push " + obj + " success, stack frame at " + index);
  }
  
  /**
   * pop elemetns from stack
   * @param obj
   */
  public Object pop(Object obj) {
    if (this.index < 0) {
      System.out.println("Stack is empty");
    }
    return null;
  }
  
  public MyStack (Object[] elements) {
    this.elements = elements;
  }
  
  public Object[] getElements () {
    return elements;
  }
  
  public void setElements (Object[] elements) {
    this.elements = elements;
  }
}

class Husband{

}
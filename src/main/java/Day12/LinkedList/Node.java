package Day12.LinkedList;

public class Node {
  Object element;
  Node next;
  
  public Node (Object element, Node next) {
    this.element = element;
    this.next = next;
  }
  
  
  public Node next () {
    return this.next;
  }
  
}

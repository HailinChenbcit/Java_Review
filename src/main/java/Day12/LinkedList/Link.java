package Day12.LinkedList;

public class Link {
  Node header = null;
  
  public void add(Object data){
    if (header == null) {
      new Node(data, null);
    } else {
      Node curretnLastNode = findLast(header);
      curretnLastNode.next = new Node(data, null);
    }
  }
  
  public void remove(Object obj){
  
  }
  
  public void modify(Object obj){
  
  }
  
  public void find(Object obj){
  
  }
  
  private Node findLast(Node head) {
    if (head.next == null) {
      return head;
    }
    return findLast(head.next());
  }
}


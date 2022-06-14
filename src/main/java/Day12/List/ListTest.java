package Day12.List;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
  public static void main (String[] args) {
    /*
      List is sub-interface of Collection
      List has index, can store repetitive elements and in order
      
      void add(int index, Object element)
      int indexOf(Object o)
      int lastIndexOf(Object o)
      Object remove(int index)
      Object set(int index, Object element)
      
     */
    List myList = new ArrayList();
    myList.add("A");
    myList.add("B");
    myList.add("C");
    myList.add(1,"KING");
    
    
  }
}

package Day12.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class ArrayTest02 {
  public static void main (String[] args) {
    List myList1 = new ArrayList();
    List myList2 = new ArrayList(100);
  
    Collection c =  new HashSet();
    c.add(100);
    c.add(200);
    c.add(300);
    
//    convert HashSet to ArrayList
    List myList3 = new ArrayList(c);
    for (Object o : myList3) {
      System.out.println(o);
    }
  }
}

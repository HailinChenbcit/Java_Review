package Day12.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionIteration {
  public static void main (String[] args) {
    /*
      This iteration applies to Collection and its subclasses,
      EXCEPT for Map set.
     */
    Collection c = new HashSet();
    c.add("abc");
    c.add(100);
    c.add(100); // cannot add duplicate element
  
    Iterator iterator = c.iterator();
    /*
      iterator.hasNext()
      iterator.next()
     */
    while (iterator.hasNext()) {
      Object obj = iterator.next();
      System.out.println(obj);
    }

    Collection c1 = new ArrayList();
    c1.add(1);
    c1.add("abc");
    c1.add(1);
    Iterator it = c1.iterator();
    while (it.hasNext()){
      Object obj = it.next();
      System.out.println(obj);
    }
    
    Collection c3 = new ArrayList();
    String s1 = new String("abc");
    c3.add(s1);
    String s2 = new String("def");
    c3.add(s2);
    System.out.println("Number of elements: " + c3.size());
    
    String x = new String("abc");
//    x.equals(s1);// true, compare value not reference address
    System.out.println(c3.contains(x));//true, using equals
    
    c3.remove(x);// remove all "abc", using equals()
    System.out.println(c3.size());
    
  }
}

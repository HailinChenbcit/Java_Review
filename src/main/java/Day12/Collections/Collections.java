package Day12.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/*
 * Collection is a container, stores references
 * Different collection type ahs different data structure
 * 1. java.util.Collection: using single value (Arraylist)
 * 2. java.util.Map: using key:value pairs (dict)
 * 3. All collections are Iterable, Collection has two subclass List and Set
 * 4. List: In order, has repeat element; Set: not in order, no duplicates
 */
public class Collections {
  public static void main (String[] args) {
    /*
      Collection method:
      boolean add(Object e)
      int size()
      boolean contains()
      void clear()
      boolean remove()
      boolean isEmpty()
      Object[] toArray()
     */
    Collection c = new ArrayList();
    c.add("abc");
    c.add(100);
    c.toArray();
    System.out.println(c);
  }
}

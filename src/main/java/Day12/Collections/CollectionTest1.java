package Day12.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest1 {
  public static void main (String[] args) {
    Collection c = new ArrayList();
    
    c.add(1);
    c.add(2);// Object type: Integer
    c.add(3);
//    集合结构发生改变，iterator必须重新获取
    Iterator it = c.iterator();
    while (it.hasNext()) {
      Object obj = it.next();
      System.out.println(obj);
    }
  }
}

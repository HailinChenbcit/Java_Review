package Day13.adam.Maps;

import java.util.TreeSet;

public class SortedMap {
  public static void main (String[] args) {
    /*
      1, binary tree
      2. TreeMap
      3. Not in order, no duplicate, but order as element values(ascending)
      4. Cannot arrange customized type (not implement java.lang.Comparable interface)
     */
    TreeSet<String> treeSet = new TreeSet<>();
    treeSet.add("Ch");
    treeSet.add("Ab");
    treeSet.add("Zh");
    
    for (String s : treeSet) {
      System.out.println(s);
    }
  }
}

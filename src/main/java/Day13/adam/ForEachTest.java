package Day13.adam;

import com.sun.source.tree.Tree;

import java.util.*;

public class ForEachTest {
  public static void main (String[] args) {
    int[] arr = {1, 2, 5, 7, 8};
    for (int i:
         arr) {
      System.out.println(i);
    }
    
    List<String> strList = new ArrayList<>();
    strList.add("hello");
    strList.add("Kitty");
  
    for (String s : strList) {
      System.out.println(s);
    }
    
//    Hashset : not in order, no duplicate
    HashSet<Integer> strs = new HashSet<>();
    strs.add(5);
    strs.add(1);
    strs.add(4);
    strs.add(5);
    strs.add(1);
    strs.add(11);
  
    for (int i : strs) {
      System.out.println(i);
    }

//    Treeset: not in order, no duplicate, but stored element in order
    Set<String> stres = new TreeSet<>();
    stres.add("A");
    stres.add("B");
    stres.add("F");
    stres.add("D");
    stres.add("Z");
    stres.add("D");
    for (String s : stres) {
      System.out.println(s);
    }
  }
}

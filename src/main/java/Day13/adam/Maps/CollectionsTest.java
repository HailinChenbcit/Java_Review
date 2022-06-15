package Day13.adam.Maps;

import java.util.*;

public class CollectionsTest {
  public static void main (String[] args) {
    List<String> list = new ArrayList<>();
    Collections.synchronizedList(list);
    
    list.add("abf");
    list.add("abc");
    list.add("abz");
    list.add("aba");
//    sort list, List collection must implement Comparable interface
    Collections.sort(list);
    for (String s : list) {
      System.out.println(s);
    }
    
//    Sorting set
    Set<String> set = new HashSet<>();
    set.add("king");
    set.add("king3");
    set.add("king2");
    set.add("king1");
//    Convert set to arraylist
    List<String> myList = new ArrayList<>(set);
    Collections.sort(myList);
    for (String s : myList) {
      System.out.println(s);
    }
  }
}

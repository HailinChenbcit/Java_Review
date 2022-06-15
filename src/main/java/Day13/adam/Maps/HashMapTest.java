package Day13.adam.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
  public static void main (String[] args) {
    /*
      Hashmap:
      Node<K,V>[] table;
      keys are in HashSet, not in order and no duplicate
      
      Hashmap initial capacity is 16 (1 << 4, power of 2, to make it hash evenly)
      DEFAULT_LOAD_FACTOR=0.75 (when 0.75 capacity used, it will expand)
     */
    Map<Integer, String> map = new HashMap<>();
    map.put(111,"aaa");
    map.put(222,"bbb");
    map.put(333,"ccc");
    map.put(333,"ddd");
    System.out.println(map.size());
    Set<Map.Entry<Integer, String>> set = map.entrySet();
    for(Map.Entry<Integer, String> entry : set) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }
  }
}

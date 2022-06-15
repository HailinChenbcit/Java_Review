package Day13.adam.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
  public static void main (String[] args) {
    /*
      Hashmap:
      Node<K,V>[] table;
      Using hashCode() to get K's hashcode, then using hash function convert to a value as index in an array,
      
      if array[key] == null, add the node to index;
      if not, compare the K with existing Ks, if equals() all false, add Node to the tail
      keys are in HashSet, not in order and no duplicate
      
      hash key can be null (but only 1 can be null)
      
      Hashmap initial capacity is 16 (1 << 4, power of 2, to make it hash evenly)
      DEFAULT_LOAD_FACTOR=0.75 (when 0.75 capacity used, it will expand)
      
      If same hash value, must be in the same singlelinkedlist;
      Hash Collision: two hash values, but converted to same index
      Resolve method: A simple way to do this is to start at the original hash value position and
      then move in a sequential manner through the slots until we encounter the first slot that is empty
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

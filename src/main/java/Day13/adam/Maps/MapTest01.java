package Day13.adam.Maps;

import java.util.*;

public class MapTest01 {
  public static void main (String[] args) {
//    Map<Integer, String> map = new HashMap<>();
//    map.put(1, "A");
//    map.put(2, "B");
//    map.put(3, "C");
//
//    String value = map.get(2);
//    System.out.println(value);
//    System.out.println(map.size());
//    map.remove(2);
//    System.out.println(map.containsKey(5));
//    System.out.println(map.containsValue("SS"));
//
//    Collection<String> values = map.values();
//    for (String s : values) {
//      System.out.println(s);
//    }
//
//    map.clear();
//    System.out.println(map.isEmpty());
  
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "A");
    map.put(2, "B");
    map.put(3, "C");
    
//    iterate keys
    Set<Integer> keys = map.keySet();
    Iterator<Integer> it = keys.iterator();
    
    while(it.hasNext()){
      Integer key = it.next();
      String value = map.get(key);
      System.out.println(value);
    }
    
    for (Integer key : keys) {
      System.out.println(map.get(key));
    }
    
//    using Set<Map.Entry<K,V>> entrySet()
//    This way is more efficient
    Set<Map.Entry<Integer, String>> set = map.entrySet();
    for (Map.Entry<Integer, String> node : set) {
      System.out.println(node.getKey() + ":" + node.getValue());
    }
  }
}

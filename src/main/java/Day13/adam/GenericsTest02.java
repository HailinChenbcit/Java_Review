package Day13.adam;

import java.util.ArrayList;
import java.util.List;

/*
  <> can be anything, the type will be declared when instantiate object
  Usually <T> or <E>
 */
public class GenericsTest02<generification> {
  public static void main (String[] args) {
//    ArrayList<Auto-assume type>
    List<Animal> list = new ArrayList<>();
//    list.add("abc");
    GenericsTest02<String> gt = new GenericsTest02<>();
    gt.doSome("Only string allowed");
  }
  
  public void doSome(generification o ) {
    System.out.println(o);
  }
}

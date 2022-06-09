package Day8;

/**
 * String is immutable, everytime concatenation will generate new string in memory.
 *
 */
public class StringBufferTest {
  public static void main (String[] args) {
    StringBuffer sb = new StringBuffer(20);// default initial capacity 16
    sb.append(1);
    sb.append('a');
    sb.append(true);
    sb.append(2.0f);
    sb.append("hello");
//    Using append to concatenate, the arraySize will auto increase
    System.out.println(sb);
  }
}



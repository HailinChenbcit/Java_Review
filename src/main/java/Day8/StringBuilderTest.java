package Day8;

public class StringBuilderTest {
  public static void main (String[] args) {
    StringBuilder sb = new StringBuilder(20);
    sb.append(1);
    sb.append("hello");
    sb.append(10L);
//    StringBuffer is synchronized(safe in multi-thread)
    
  }
}

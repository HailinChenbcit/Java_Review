package Day8;

import java.util.Locale;

public class StringMethod {
  public static void main (String[] args) {
//    three objects:
//    two in heap; one in String constant pool
    String s1 = new String("hello");
    String s2 = new String("hello");
    
    char[] chars = {'c','a','n','a','d','a'};
    String s3 = new String(chars);
    System.out.println(s3);//canada
    
    String s4 = new String(chars,3,3);
    System.out.println(s4);//ada
    
    char c = "canada".charAt(2);
    System.out.println(c);
    
    String newString = "http://www.google.com".replace("http://","https://");
    System.out.println(newString);
  
    System.out.println("   hello   world   ".trim());// clear all leading and trailing space
    System.out.println("hello".toUpperCase());
    
    String ss = String.valueOf(1);// convert to String
    System.out.println(ss);
    
    
  }
}

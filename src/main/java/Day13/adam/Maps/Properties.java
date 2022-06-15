package Day13.adam.Maps;

public class Properties {
  public static void main (String[] args) {
    java.util.Properties pro = new java.util.Properties();
    pro.setProperty("url", "www.url.com");
    
    String s = pro.getProperty("url");
    System.out.println(s);
    
    
  }
}


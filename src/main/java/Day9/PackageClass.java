package Day9;

public class PackageClass {
  public static void main (String[] args) {
//    autoboxing 8 primitive types has 8 reference types package
//    Integer/Double/Float/Boolean/Char/Short/Byte
    /*
    Boolean, Char parent class is Object; All other's parent class is Number
     */
    doSome(1);
    doSome(5.0F);
    doSome("Hello");
//    Integer x = new Integer(100);
//    Double e = new Double("3.14");
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Byte.MAX_VALUE);
    System.out.println(Byte.MIN_VALUE);
    
//  auto-boxing primitive -> reference type
    Integer x = 100;
//  auto-unboxing reference type -> reference
    int y = x;
//   manual unboxing
    int z = x.intValue();
    
//   static method
    int ret = Integer.parseInt("123");
    System.out.println(ret+100);
    
//    int ret2 = Integer.parseInt("abc");
//    System.out.println(ret2);// NumberFormatException
  
    String binaryString = Integer.toBinaryString(7);// 111
    String hexString = Integer.toHexString(15);// f
    System.out.println(binaryString);
    System.out.println(hexString);
  
  }
  
  public static void doSome(Object o) {
    System.out.println(o);
  }
}

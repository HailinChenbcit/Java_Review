package Day16.Reflection;

import java.util.Date;

public class ReflectTest {
  public static void main (String[] args){
	/*
		Reflection: operate bytecode file
		Class.forName():
			static method, argument is complete class name
		obj.getClass();
		anyType.class;
	 */
	Class c1 = null;
	Class c2 = null;
	try {
	  c1 = Class.forName("java.lang.String");
	  c2 = Class.forName("java.util.Date");
	  Class c3 = Class.forName("java.lang.Integer");
	  Class c4 = Class.forName("java.lang.System");
	} catch (ClassNotFoundException e) {
	  e.printStackTrace();
	}

	Class x = "abc".getClass();
	System.out.println(c1 == x);// true same address
	
	Class y = Date.class;
	System.out.println(c2 == y);
	
	Class z = String.class;
	System.out.println(x == z);
  }
}

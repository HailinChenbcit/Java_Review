package Day1;

/**
 * 1. One public class in each .java file
 * 2. The class name should be the same as the file name.
 */
public class JavaBasics {
    /**
     * main function: entrance -- __name__ == '__main__'
     * Only one entrance allowed
     */
    public static void main(String[] args) {
        System.out.println("Hello, Java");
        long x = 100L;
//        int y = x;
        int y = (int) x;
        System.out.println(y);
        
//      double8; float4 capacity > long8 capacity (any floating type4 > integer4 type)
        double d = 1.0;
        float f = 1.0f;
        long l = 1L;
        System.out.println(d > f);
        System.out.println(f > l);
        
    }

    /**
     * Javadoc test
     *  javadoc -d (directory name) -author -version
     *  save javadoc to directory
     * shortcut - shift+Enter
     */
    static class A {
        int sample = 'A';
    }

    /**
     * Select Tools - Generate javadoc to define output dir and scope
     */
    public void start(){
        int ageToday = 20;
        System.out.println(ageToday);
        ageToday = 30;
        System.out.println(ageToday);
//        int ageToday = 100;
//        variable can be reassigned value, cannot be redeclared in the same scope
//        int a, b, c = 100; // a, b are not be assigned value
        int a = 10, b = 20, c = 50;
        System.out.println(a);
//        scope: based on curly braces
    }
    
    /**
     * byte 1
     * short 2
     * int 4
     * long 8
     * float 4
     * double 8
     * boolean 1bit
     * char 2
     * ASCII:
     * 'a' --> 97
     * 'A' --> 65
     */
    public void dataType() {
//        1. char: 2bytes using unicode encoding
//        char range: [0, 2^x]
//        casting char to int -> get ASCII value
//        char x = int number, result will be a character (within range)
        char uniChar = '\u4e2d'; // 中
        char character = 'a';
        char anotherChar = 97; // 'a'
        System.out.println((int) character);
//        if its String, using string.charAt(index)
        System.out.println("\"Double quotes around me\"");
        System.out.println("'Single quotes around me'");
//          2. int
//          byte 1, short 2, int 4, long 8 : all integer type
//          short: [-2^x, 2^x - 1]
        System.out.println("Oct" + 010);
        System.out.println("Hex" + 0x10);
        System.out.println("Binary" + 0b10);
//          Data conversion
//          Promotion: widening conversion -- automatic
        long a = 200;
        long b = 300L; // no conversion
//          unless specify type, int/long/float will be treated as integer
//          Narrowing:
        long x = 100L;
//        int y = x; // cannot compile
//          Casting:
        int y = (int) x; // lose precision and magnitude
//          Assignment conversion
//          byte someValue = 127;
//          int widerValue = someValue;
        byte canBeAssigned = 1;
//        byte cannotAssigned = 128; // out of range
        System.out.println(canBeAssigned);
        
        /*
            if the integer didn't exceed byte/short/char range, can be assigned to
            variable directly
         */
    }
    
    public void moreDataType() {
        /*
            Multiple types, result will be 'max capacity' type
         */
        long a = 10L;
        char b = 'a';
        short c = 100;
        int i = 30;
        int x = (int)(a + b + c + i); // casting to int, cuz the result is long
        
        int temp = 10 / 3;
        System.out.println(temp); // 3
        int temp2 = 1 / 2;
        System.out.println(temp2);
        /*
            float 4 bytes - single precision
            double 8 bytes - double precision
            BUT float4 capacity > long8 capacity (any floating type4 > integer4 type)
         */
        double d = 1.0;
        float f = 1.0f;
        /*
            boolean only has true and false (NO 1 or 0)
         */
//        boolean bool = 1;
        /*
            arithmetic operator
            ++x pre: add then assign
            x++ post: assign then add
         */
        int m = 20;
        int n = m++;
        System.out.println(n); // 20
        System.out.println(m); // 21
    
        int n2 = ++m;
        System.out.println(m); // 22
        System.out.println(n2); // 22
        
//        pass by value
        int s = 90;
        System.out.println(s++);// 90
        System.out.println(s);// 91
        int s2 = 80;
        System.out.println(++s2);// 81
        System.out.println(s2);// 81
        
//        Difference:
//        if += : result type won't be changed
//        else if: = x + int: may have to casting
        byte someAdd = 10;
        someAdd += 10;
        someAdd =(byte) (someAdd + 10);// byte + int
        
//        Ternary Operator
        boolean someBool = true;
        int x1 = someBool ? 1 : 0;
        System.out.println(x1);
    }
    
}

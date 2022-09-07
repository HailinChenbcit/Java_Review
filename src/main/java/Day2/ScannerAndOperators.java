package Day2;

public class ScannerAndOperators {
  public static void main (String[] args) {
    /*
    >> is arithmetic shift right, >>> is logical shift right.
    In an arithmetic shift, the sign bit is extended to preserve the signedness of the number.
     */
//    int x = -2; // 1111 1110
//    int y = x >> 1; // 1111 1111
//    int z = x >>> 1; // 0111 1111
//    System.out.println(y);
//    System.out.println(z);
    
    /*
    Scanner
     */
//    java.util.Scanner sc = new java.util.Scanner(System.in);
//    int userInput = sc.nextInt();
//    System.out.println(userInput);
    
    /*
    selection: using if and switch
     */
    java.util.Scanner sc = new java.util.Scanner(System.in);
//    int age = sc.nextInt();
//    if (age < 0 || age > 150) {
//      System.out.println("Age not eligible");
//    } else {
//      if (age <= 5) {
//        System.out.println("Infant");
//      } else if (age <= 15) {
//        System.out.println("Teenager");
//      } else if (age <= 60) {
//        System.out.println("Adult");
//      } else {
//        System.out.println("TOO old!");
//      }
//    }
    // switch value only support int type (short char) and string
//    double score  = sc.nextDouble();
//    int grade = (int) score / 10;
//    String str = "Not Pass";
//    switch (grade) {
//      case 10, 9 -> str = "Excellent";
//      case 8 -> str = "Good";
//      case 7 -> str = "Mid";
//      case 6 -> str = "BAD";
//    }
//    System.out.println(str);
  
//    Looping: for
//    print 100 lines
//    for (int i = 0; i < 100; i++) {
//      System.out.println("This is line" + (i + 1));
//    }
//    infinite loop
//    for (;;){
//      System.out.println("DEAD END!");
//    }
    
//    sum of all odd numbers that less than 100
//    int sum = 0;
//    for (int i = 1; i < 100; i += 2) {
//      sum += i;
//    }
//    System.out.println(sum);
    
//    do...while: At least execute 1~n times, execute the body then check while
//    While: 0~n times
//    int i = 0;
//    do {
//      System.out.println(i++); // 0~9
//    } while (i < 10);
  
//    do {
//      System.out.println(++i); // 1~10
//    } while (i < 10);
    
    /*
    break and continue
     */
//    loop with a label
//    a: for (int i=0; i<3; i++){
//      b: for (int j=0; j<3; j++) {
//        if (j == 2) {
//          break a;
//        }
//      }
//      System.out.println("Ended");
//    }
  
    for (int i =0; i < 5; i++) {
      if (i == 3) {
        continue;
      }
      System.out.println(i);
    }
    
    
  }
}

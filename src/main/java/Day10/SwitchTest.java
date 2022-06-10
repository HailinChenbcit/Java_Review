package Day10;

public class SwitchTest {
  public static void main (String[] args) {
    switch (Season.AUTUMN) {
      case SPRING -> System.out.println("SPRINT");
      case SUMMER -> System.out.println("SUMMER");
      case AUTUMN -> System.out.println("AUTUMN");
      case WINTER -> System.out.println("WINTER");
    }
  }
}

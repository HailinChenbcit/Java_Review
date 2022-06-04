package Day4;

public class ThisTest {
  public static void main (String[] args) {
    Date d1 = new Date();
    d1.detail();
    
    Date d2 = new Date(2022, 6, 6);
    d2.detail();
  }
}

class Date {
  private int year;
  private int month;
  private int day;
  
  public Date(){
//    this.year = 1900;
//    this.month = 1;
//    this.day = 1;
//    access another constructor method within same class
//    Should be at the first line of the constructor method
    this(1900, 1, 1);
  }
  
  public Date (int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }
  
  public void detail() {
    System.out.println(year+ ", " + month + ", " + day);
  }
  
  public int getYear () {
    return year;
  }
  
  public void setYear (int year) {
    this.year = year;
  }
  
  public int getMonth () {
    return month;
  }
  
  public void setMonth (int month) {
    this.month = month;
  }
  
  public int getDay () {
    return day;
  }
  
  public void setDay (int day) {
    this.day = day;
  }
}
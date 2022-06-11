package Day10.adam.Records;

public record EmployeeRecord(String name, int employeeNumber) implements Runnable{
//  with final keyword, they are immutable by default
//  default args-constructor and getter method, no setter
  /*
    records cannot extends class
    cannot create instance field : private String something;
   */
  public static final String DEFAULT_NAME = "George";
  
  public EmployeeRecord {
    if (employeeNumber < 0) {
      throw new IllegalArgumentException("employee number cannot be negative");
    }
  }
  
  public String nameInUpper(){
    return name.toUpperCase();
  }
  
  public static void printSomething(){
    System.out.println("Print something");
  }
  
  @Override
  public void run () {
  
  }
}

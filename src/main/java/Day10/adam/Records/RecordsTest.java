package Day10.adam.Records;

public class RecordsTest {
  public static void main (String[] args) {
//    using Class
    EmployeeClass employee = new EmployeeClass("Tom",123);
    System.out.println(employee.getName());
//    using Records
    EmployeeRecord employeeRecord = new EmployeeRecord("Krama",321);
    System.out.println(employeeRecord.name());
    System.out.println(employeeRecord);
    System.out.println(employeeRecord.nameInUpper());
    EmployeeRecord.printSomething();
  }
}

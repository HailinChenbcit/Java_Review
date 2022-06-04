package Day4;

/**
 * 1. constructor method
 *  Name should be the same as the class name
 *  Used to create instances and initialize instance variable
 *  If not assigned value, will use default value
 * 2. If Class doesn't have constructor, system provides the no-arg method automatically
 *    If manually added constructor method, system won't provide non-arg method
 * 3. using new to invoke constructor method
 * 4. No return type (not void)
 */
public class Constructor {
  public static void main (String[] args) {
    Student s1 = new Student();
//    System.out.println(s1);
//    User u = new User();

//    Access static method
//    Constructor.doSome();
//    doSome();
//    Access non-static method, need to new an instance
//    reference.methodName to access
//    Constructor cs = new Constructor();
//    cs.doOther();
    
    s1.setAge(-100);
  }
//  Static method
//  All static method/variable, access by class.methodName, no need to "new" instance
//  Access the Class, not instance, won't have NullPointerException.
  public static void doSome(){
    System.out.println("Static method");
  }
//  Instance method
//  access by reference.methodName, need to "new" instance
  public void doOther() {
    System.out.println("Non-static method");
  }
}

class Student {
  int studentID;
  String name;
  int age;
  
  public Student() {
//    System.out.println("No-Arg method");
  }
  
  public Student(int i) {
    System.out.println("with int type overload method");
  }
  
  public Student(String name) {
    System.out.println("with String type overload method");
  }
  
//  getter and setter are instance method
  public int getStudentID () {
    return studentID;
  }
  
  public void setStudentID (int studentID) {
    this.studentID = studentID;
  }
  
  public String getName () {
    return name;
  }
  
  public void setName (String name) {
    this.name = name;
  }
  
  public int getAge () {
    return age;
  }
  
  public void setAge (int age) {
    if (age < 0 || age > 120) {
      System.out.println("Not eligible!");
      return;
    }
    this.age = age;
  }
}
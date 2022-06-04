package Day3;

public class Student {
//  Attributes
  private int studentID;
  private String name;
  private int age;
  private boolean sex;
  private String address;
  
//  public Student (int studentID, String name, int age, boolean sex, String address) {
//    this.studentID = studentID;
//    this.name = name;
//    this.age = age;
//    this.sex = sex;
//    this.address = address;
//  }
  
  @Override
  public String toString () {
    return "Student{" +
                   "studentID=" + studentID +
                   ", name='" + name + '\'' +
                   ", age=" + age +
                   ", sex=" + sex +
                   ", address='" + address + '\'' +
                   '}';
  }
  
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
    this.age = age;
  }
  
  public boolean isSex () {
    return sex;
  }
  
  public void setSex (boolean sex) {
    this.sex = sex;
  }
  
  public String getAddress () {
    return address;
  }
  
  public void setAddress (String address) {
    this.address = address;
  }
}

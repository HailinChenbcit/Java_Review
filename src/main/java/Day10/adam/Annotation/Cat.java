package Day10.adam.Annotation;

@VeryImportant
public class Cat {
  @ImportantString
  String name;
  
  public Cat (String name) {
    this.name = name;
  }
  
  @VeryImportant
  @RunImmediately(times = 3)
  public void meow() {
    System.out.println("Meow");
  }
  
  public void eat() {
    System.out.println("Munch");
  }
}

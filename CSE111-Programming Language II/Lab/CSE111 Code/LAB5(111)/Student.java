public class Student {
  private String name;
  static int count=0;
  Student() {
    name="default name";
    count++;
  }
  Student(String name) {
    this.name=name;
    count++;
  }
  public String getName() {
    return name;
  }
}
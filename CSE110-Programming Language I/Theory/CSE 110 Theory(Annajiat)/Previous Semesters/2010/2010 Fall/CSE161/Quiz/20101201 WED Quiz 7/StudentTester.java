public class StudentTester{
  public static void main(String[]args){
    Student s = new Student ();
    System.out.println(s.name);
    System.out.println(s.age);
    s.age = 20;
    s.name = "Kaonain";
    System.out.println(s.name);
    System.out.println(s.age);
    Student s2 = s;
    System.out.println(s.name);
    System.out.println(s2.age);
    s2.age = 99;
    System.out.println(s.age);
    s2 = new Student();
    s.name="Noman";
    System.out.println(s2.name);
    System.out.println(s2.age);
    System.out.println(s.name);
  }
}


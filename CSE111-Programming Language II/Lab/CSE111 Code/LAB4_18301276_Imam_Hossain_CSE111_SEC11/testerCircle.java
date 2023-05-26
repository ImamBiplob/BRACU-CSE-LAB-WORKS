public class testerCircle {
  public static void main(String[] args) {
    Circle c=new Circle();
    System.out.println(c.getradius());
    System.out.println(c.getArea());
    Circle c2=new Circle(5.0);
    System.out.println(c2.getradius());
    System.out.println(c2.getArea());
  }
}
public class CarDriver{
  public static void main(String[]args){
    System.out.println("Testing... Creating without any argument/parameter");
    Car a = new Car();
    System.out.println(a);
    
    System.out.println("\n\nTesting... Creating with only one argument/parameter");
    Car b = new Car("Mitshubishi");
    System.out.println(b);
    
    System.out.println("\n\nTesting... Creating with both arguments/parameters");
    Car c = new Car("Nissan","White");
    System.out.println(c);
  }
}
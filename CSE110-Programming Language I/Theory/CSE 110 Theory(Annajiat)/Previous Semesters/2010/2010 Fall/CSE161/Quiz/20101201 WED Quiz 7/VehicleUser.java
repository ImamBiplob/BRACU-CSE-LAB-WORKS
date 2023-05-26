public class VehicleUser{
  public static void main(String[]args){
    Vehicle v = new Vehicle();
    System.out.println(v.name);
    System.out.println(v.model);
    v.model = 2001;
    v.name = "Toyota Car";
    System.out.println(v.name);
    System.out.println(v.model);
    Vehicle v2 = v;
    System.out.println(v.name);
    System.out.println(v2.model);
    v2.model = 1999;
    System.out.println(v.model);
    v2 = new Vehicle();
    v.name="Nissan Jeep";
    System.out.println(v2.name);
    System.out.println(v2.model);
    System.out.println(v.name);
  }
}
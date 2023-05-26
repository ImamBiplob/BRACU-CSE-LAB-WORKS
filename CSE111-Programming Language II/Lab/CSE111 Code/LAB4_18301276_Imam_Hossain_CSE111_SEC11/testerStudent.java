public class testerStudent {
  public static void main(String[] args) {
     Student john=new Student();
    john.setName("John");
    System.out.println(john.getName());
    john.setID("18301272");
    System.out.println(john.getID());
    john.setAddress("Gulshan");
    System.out.println(john.getAddress());
    john.setCGPA(3.50);
    System.out.println(john.getCGPA());
     Student mike=new Student();
    mike.setName("mike");
    System.out.println(mike.getName());
    mike.setID("18301273");
    System.out.println(mike.getID());
    mike.setAddress("Banani");
    System.out.println(mike.getAddress());
    mike.setCGPA(3.60);
    System.out.println(mike.getCGPA());
     Student carol=new Student();
    carol.setName("carol");
    System.out.println(carol.getName());
    carol.setID("18301274");
    System.out.println(carol.getID());
    carol.setAddress("Niketon");
    System.out.println(carol.getAddress());
    carol.setCGPA(3.70);
    System.out.println(carol.getCGPA());
  }
}
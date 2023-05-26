//user/driver/tester class
public class MyRobotTester {
      public static void main (String[] args) {
            MyRobot mr = new MyRobot();
            mr.name = "Robocop";
            mr.model = 1990;
//            System.out.println(mr.name);
//            System.out.println(mr.model);
            mr.sayHi();
            System.out.println(mr);
            
            MyRobot mr2 = new MyRobot();
            mr2.name = "WALL E";
            mr2.model = 2005;
//            System.out.println(mr2.name);
//            System.out.println(mr2.model);
            System.out.println(mr2);
            mr2.sayHi();
            
            int uttor;
            uttor = mr.jogKoro(2,3);
            System.out.println(uttor);
      }
}
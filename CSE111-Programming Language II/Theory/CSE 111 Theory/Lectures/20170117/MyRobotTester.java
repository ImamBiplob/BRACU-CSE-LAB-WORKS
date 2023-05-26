//user/tester/driver class
public class MyRobotTester {
    public static void main(String[] args) {
        MyRobot r = new MyRobot();
        r.naam = "WALL E";
        r.model = 2007;
//        System.out.println(r.naam);
//        System.out.println(r.model);
        r.dekhao();
        MyRobot r2 = new MyRobot();
        r2.naam = "Robocop";
        r2.model = 1990;
//        System.out.println(r2.naam);
//        System.out.println(r2.model);
        r2.dekhao();
        int uttor = r.jogKoro(2,3);
        System.out.println(uttor);
    }
}
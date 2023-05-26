//user/tester/driver class
import static java.lang.System.*;
class MyRobotTester {
    public static void main (String[] args) {
        MyRobot mr = new MyRobot();
        mr.name = "RoboCop";
        //mr.model=-500;
        mr.modelRakho(-500);
        out.println(mr.modelJanao());
//        out.println(mr.toString());
        MyRobot mr2 = new MyRobot();
        mr2.name = "WALL E";
        mr2.modelRakho(2005);
        out.println(mr2.modelJanao());
        //mr2.model=2005;
        
//        out.println(mr2.toString());
    }
}
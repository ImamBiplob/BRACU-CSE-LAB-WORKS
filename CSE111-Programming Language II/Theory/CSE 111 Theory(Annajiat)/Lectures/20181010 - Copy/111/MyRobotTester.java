//tester/driver/user class
public class MyRobotTester {
    public static void main (String[] args) {
        MyRobot mr1;
        try 
        {
            mr1 = new MyRobot("RoboCop",1990);
            MyRobot mr2 = new MyRobot("WALL E",2004);
            MyRobot mr3 = new MyRobot();
            mr1.setModel(-7);
        } catch (Exception e) {
            System.out.println("caught and found: "+e);
        }
        System.out.println(mr1.getModel());
        /*mr1.name="RoboCop";
        //mr1.model=2007;
        mr1.setModel(-7);
        mr2.name="WALL E";
        //mr2.model=2004;
        mr2.setModel(2004);*/
       /* System.out.println(mr1.getModel());
        System.out.println(mr2.getModel());
        System.out.println(mr1);
        System.out.println(mr2);*/
    }
}
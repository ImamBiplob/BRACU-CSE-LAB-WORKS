//user/tester/driver class
import static java.lang.System.*;
public class RobotTester {
    public static void main (String[] args) {
        WallE w1 = new WallE();
        w1.name="w220";
        w1.model=2015;
        /*out.println("naam="+w1.name);
        out.println("make="+w1.model);*/
        //10000
        w1.bolen();
        WallE w2 = new WallE();
        w2.name="k1001";
        w2.model=2017;
        /*out.println("naam="+w2.name);
        out.println("make="+w2.model);*/
        w2.bolen();
        //10000
        int uttor = w1.jogKoren(2,3);
        out.println(uttor);
    }
}
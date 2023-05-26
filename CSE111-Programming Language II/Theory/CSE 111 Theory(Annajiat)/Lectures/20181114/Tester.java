public class Tester {
    public static void main(String[] args) { 
//        IPhone a = new SmartPhone();
        SmartPhone b = new SmartPhone();
//        b.m1();
        SmartPhone c = new IPhone();
//        c.m1();
        ((IPhoneX)c).m3();
        
    }
}

/*A a = new A();
a.mA();*/
class A {
    int x;
    int mB(){
        x *= 2;
        return x;
    }
    void mA(){
        System.out.println("just came inside mA, x="+x);
        x = 5;
        int y = x + mB();
        System.out.println(y);
        y = mB() + x;
        System.out.println(y);
        System.out.println("going out of mA x="+x);
    }
}
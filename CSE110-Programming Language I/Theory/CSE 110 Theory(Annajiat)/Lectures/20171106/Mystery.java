public class Mystery {
    void m3(){
        m4();
        System.out.println("bye");
    }
    void guess(){
        m3();
        System.out.println("jai");
    }
    void m2(){
        m1();
        System.out.println("tai");
    }
    void m4(){
        System.out.println("hi");
        m2();
    }
    void m1(){
        System.out.println("nai");
    }
}
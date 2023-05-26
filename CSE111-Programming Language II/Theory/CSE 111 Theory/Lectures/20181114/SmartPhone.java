class SmartPhone {
    void m1(){
        System.out.println("I'm m1 of SmartPhone");
    }
    void m2(){
        System.out.println("I'm m2 of SmartPhone");
    }
    
}
class IPhone extends SmartPhone {
    void m1(){
        System.out.println("I'm m1 of IPhone");
    }
    void m3(){
        System.out.println("I'm m3 of IPhone");
    }
}
class IPhoneX extends IPhone {
    void m4(){
        System.out.println("I'm m4 of IPhoneX");
    }
}
class SamsungPhone extends SmartPhone {
}
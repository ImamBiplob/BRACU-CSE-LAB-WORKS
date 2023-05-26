public class Tester {
    public static void main(String[] args) { 
        //parent class ref.var. can refer to child class obj
        Phone n = new Phone();
        n.tellAboutYourself();
        
        Phone i = new IPhone();
        i.tellAboutYourself();
        ((IPhone)i).tellMore();
        
        Phone g = new SamsungPhone();
        ((IPhone)g).tellAboutYourself();
    }
}

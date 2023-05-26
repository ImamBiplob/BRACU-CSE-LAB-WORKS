import static java.lang.System.*;
public class HumanTester {
    public static void main(String[] args) { 
        Human h1,h2;//ref.var.
        h1 = new Human();//object creation/instantiation
//        out.println(h1.name);
//        out.println(h1.age);
        out.println( h1 );//h1.toString()
        h1.name = "java";
        h1.age = 100;
//        out.println(h1.name);
//        out.println(h1.age);
        out.println( h1 ) ;
        out.println( h1.jogKoro(2,3) );
    }
    
}

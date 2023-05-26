class Sue {
 void method1() {
  System.out.println("sue 1");
 }

 void method3() {
  method1();
  System.out.println("sue 3");
  method1();
 }
}

class Blue {
 void method1() {
  System.out.println("blue 1");
  method3();
 }

 void method3() {
  System.out.println("blue 3");
 }
}

class Moo extends Blue {
 void method2() {
  super.method3();
  System.out.println("moo 2");
 }

 void method3() {
  System.out.println("moo 3");
 }
}

class Crew extends Moo {
 void method1() {
  System.out.println("crew 1");
 }

 void method3() {
  System.out.println("crew 3");
 }
}
public class TestClass{
  public static void main(String [] args){
    Moo var1 = new Crew();
    Blue var2 = new Moo();
    Object var3 = new Moo();
    Sue var4 = new Sue();
    Blue var5 = new Crew();
    Blue var6 = new Blue();
    ((Moo)var2).method1();         
  }
}

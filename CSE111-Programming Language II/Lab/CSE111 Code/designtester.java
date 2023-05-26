public class designtester{
  public static void main(String[]args){
    
Design a = new Design();
Design b = new Design();
a.proc();
a.v1 = 3;
a.callBack();
b.v1 = a.v2;
b.proc(); 
  }
}
 
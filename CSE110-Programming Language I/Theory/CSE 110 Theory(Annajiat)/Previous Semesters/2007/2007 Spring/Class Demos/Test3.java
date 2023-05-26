public class Test3{
  public int sum;
  public int y;
  public void vc(){    
    int [] msg = new int[2];
    System.out.println("In VC");
    System.out.println("VC: sending msg " + msg[0] + " " + msg[1]);
    cofd(msg);
    System.out.println("VC: msg after call " + msg[0] + " " + msg[1]);
  }
  private void cofd(int [] msg){
    System.out.println("In cofd");
    System.out.println("COFD: msg from vc "+ msg[0] + " " + msg[1]);
    msg[0] = 9999;
    msg[1] = 1111;
    dco(msg);
  }
  private void dco(int [] msg){
    System.out.println("In dco");
    System.out.println("DCO: msg from cofd "+msg[0] + " "+ msg[1]);
  }
}
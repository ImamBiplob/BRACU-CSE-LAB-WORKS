class msg{
  public int content;
}
public class Test2{
  public int sum;
  public int y;
  public void vc(){    
    msg mg = new msg();
    mg.content = 5;
    System.out.println("In VC");
    System.out.println("VC: sending msg "+mg.content);
    cofd(mg);
    System.out.println("VC: msg after call "+mg.content);
  }
  private void cofd(msg mg){
    System.out.println("In cofd");
    System.out.println("COFD: msg from vc "+mg.content);
    mg.content = 6;
    dco(mg);
  }
  private void dco(msg mg){
    System.out.println("In dco");
    System.out.println("DCO: msg from cofd "+mg.content);
  }
}

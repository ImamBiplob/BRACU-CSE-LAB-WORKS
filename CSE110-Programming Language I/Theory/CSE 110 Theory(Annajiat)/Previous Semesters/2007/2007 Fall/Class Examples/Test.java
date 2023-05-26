public class Test{
  
  public void VC(){    
    int [] msg = {2007 , 3};
    MsgC msa = new MsgC();
    msa.mymsg = 500;
    System.out.println("I am the VC");
    System.out.println("msg from vc "+msg[0]+" "+msg[1]);
    cofd(msg, msa);
    System.out.println("msg from vc "+msg[0]+" "+msg[1]);
        System.out.println("Sent from vc "+msa.mymsg);
  }
  public void cofd(int [] ms, MsgC x){
    System.out.println("I am the cofd");
    System.out.println("msg from vc "+ms[0]+" "+ms[1]);
    System.out.println("Class from vc "+x.mymsg);
    ms[0] = 2006;
    x.mymsg = 600;
    dco(ms);
  }
  public void dco(int [] m){
    System.out.println("I am the dco");
    System.out.println("msg from vc "+m[0]);    
     m[0] =  1900;
  }  
}
public class RDG{
  public void VC(){
    int [] msg = new int[2];
    msg[0] = 2007;
    msg[1] = 1;
    System.out.println("I am the VC");
    System.out.println("Sending MSG "+ msg[0] + " "+ msg[1]);
    CofD(msg);
    System.out.println("Sent MSG "+ msg[0] + " "+ msg[1]);
    System.out.println("Called CofD");
  }
  private void CofD(int [] ms){
    System.out.println("I am the CofD");
    System.out.println("Got MSG "+ ms[0] + " "+ ms[1] );
    ms[0] = 1900;
    Dco(ms);
    System.out.println("Sent MSG "+ ms[0] + " "+ ms[1]);
    System.out.println("Called Dco");
  }
  private void Dco(int [] m){
    System.out.println("I am the DCO");    
    System.out.println("Got MSG "+ m[0] + " "+ m[1]);  
  }  
}
//****************************************************************************
//Run the menthodA() on an Instance of Test3 five times and explain the answer.
//****************************************************************************
public class Test3{
  public int sum;
  public int y;
  
  public void methodA(){    
    int x=0, y =0;
    int [] msg = new int[1];
    msg[0] = 5;    
    y = y + msg[0]; 
    methodB(msg, msg[0]);
    x = y + msg[0];
    sum = x + y + msg[0];
    System.out.println(x + " " + y+ " " + sum);
  }
  private void methodB(int [] mg2, int mg1){
    int x = 0;
    y = y + mg2[0];
    x = x + 33 + mg1;
    sum = sum + x + y;
    mg2[0] = y + mg1;
    mg1 = mg1 + x + 2;
    System.out.println(x + " " + y+ " " + sum);  
  }
}
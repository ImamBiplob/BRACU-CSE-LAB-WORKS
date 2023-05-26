public class InputExample
{  
  public static void main(String args[])
  {
    int [] x = new int[10];
    int i = 0;
    SimpleInput sInp = new SimpleInput();
    while (i < 10){
      x[i] = sInp.getInt("Please Enter Integer no "+(i+1));
      i++;
    }
    i = 9;
    while (i>=0){
      System.out.println(x[i]);
      i--;
    }
  }
}


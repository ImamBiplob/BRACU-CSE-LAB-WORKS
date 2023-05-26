public class PrintInput
{  
  public static void main(String args[])
  {
    int [] myArray = new int[5];
    int i = 0, j =0;
    String buff;
    SimpleInput sInp = new SimpleInput();
    while (i < 5){
      myArray[i] = sInp.getInt("Please Enter Integer for Index "+i);
      j = 0;
      buff = "";
      while (j < i + 1){
        buff = buff + " " + myArray[j];        
        j++;
      }
      System.out.println("Till now you have entered "+ buff);
      i++;
    }
  }
}


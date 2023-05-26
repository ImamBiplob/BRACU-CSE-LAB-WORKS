public class IOArray
{  
  public static void main(String args[])
  {
    int [] myArray = new int[5];
    int i = 0, j =0;
    SimpleInput sInp = new SimpleInput();
    while (i < 5){
      myArray[i] = sInp.getInt("Please Enter Integer for Index "+i);
      i++;
    }
    while (j < 5){
      System.out.println("The number in index "+ i +" is "+ myArray[j]);
      j++;
    }
  }
}


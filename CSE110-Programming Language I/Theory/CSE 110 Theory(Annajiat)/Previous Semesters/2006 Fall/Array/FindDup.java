public class FindDup
{  
  public static void main(String args[])
  {
    int [] myArray = new int[5];
    String [] myNumbers = {"1st", "2nd", "3rd", "4th", "5th"};
    int inp = 0;
    int i = 0, j =0, k = 0;
    int foundIn = 0;
    boolean foundDup = false;
    String buff;
    SimpleInput sInp = new SimpleInput();
    while (i < 5){
      inp = sInp.getInt("Please Enter "+myNumbers[i]+ " number");
      j = 0;
      foundDup = false;
      while (j < i ){
        if (inp == myArray[j]){
          foundDup = true;
          foundIn = j;
          break;
        }        
        j++;
      }
      if (foundDup == true){
        System.out.println("You already entered this number before");
        System.out.println("Please re-enter the "+myNumbers[i]+" number.");
      }else{
        myArray[i] = inp;
        k = 0;
        buff = "";
        while (k < i + 1){
          buff = buff + " " + myArray[k];        
          k++;
        }
        System.out.println("Till now you have entered "+ buff);
        i++;
      }  
    }
  }
}


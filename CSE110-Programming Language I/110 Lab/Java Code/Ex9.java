import java.util.Scanner;
public class Ex9
{
  public static void main (String[] args)
  {
    Scanner keyboard= new Scanner (System.in);
    
    System.out.println("please enter an integer number");
   
    int x =keyboard.nextInt();
    int mod=x%2;
    if(mod==0)
    {System.out.println("The number is even");
    }
    else
    {System.out.println("The number is odd");
    }
  }
}
import java.util.Scanner;
public class InputExampleBasic
{  
    public static void main (String[] args)
    {   
        Scanner keyboard; 
        keyboard = new Scanner ( System.in );
        
        
        System.out.println("Please enter an integer number");
        int x,y; 
        x = keyboard.nextInt();   
      y=keyboard.nextInt();
      int sum=x+y;
        System.out.println(sum);
        int product=x*y;
        System.out.println(product);
        int dif=x/y;
        System.out.println(dif);
    }
}
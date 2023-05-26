
import java.util.Scanner;
public class Ex7
{  
    public static void main (String[] args)
    {   
       
        Scanner keyboard; 
        keyboard = new Scanner ( System.in );
        System.out.println("Please enter 2 integer number");
        int x,y;
       x= keyboard.nextInt();
       y=keyboard.nextInt();
       if(x>y)
       {System.out.println("first is greater");}
       else if(y>x)
       {System.out.println( "second is greater");}
       else
       {System.out.println("the numbers are equal");
       }
    }}
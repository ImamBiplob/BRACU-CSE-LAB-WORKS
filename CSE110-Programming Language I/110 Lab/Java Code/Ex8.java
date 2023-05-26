import java.util.Scanner;
public class Ex8
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
       { int sub=x-y;
         System.out.println(sub);
       }
       else
       { int sub=y-x;
         System.out.println(sub);
       }
    }}
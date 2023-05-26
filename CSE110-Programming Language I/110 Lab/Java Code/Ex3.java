import java.util.Scanner;
public class Ex3
{  
    public static void main (String[] args)
    {   
        Scanner keyboard; 
        keyboard = new Scanner ( System.in );
        
        
        System.out.println("Please enter two fractional numbers");
        float x,y; 
        x = keyboard.nextFloat();   
        y=keyboard.nextFloat();
        float sum=x+y;
        System.out.println(sum);
        float product=x*y;
        System.out.println(product);
        float dif=x/y;
        System.out.println(dif);
    }
}
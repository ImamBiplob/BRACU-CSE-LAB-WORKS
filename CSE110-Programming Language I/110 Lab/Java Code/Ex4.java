
import java.util.Scanner;
public class Ex4
{  
    public static void main (String[] args)
    {   
       
        Scanner keyboard; 
        keyboard = new Scanner ( System.in );
        
        
        System.out.println("Please enter an integer number");
      int r;
        r=keyboard.nextInt();
      double  pi=3.1416;
      double  area=pi*r*r;
      double circumference=2*pi*r;
        System.out.println(area);
        System.out.println(circumference);
    }}
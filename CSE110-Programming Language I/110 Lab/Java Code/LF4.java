import java.util.Scanner;
public class LF4
{ 
  public static void main(String[] args)
  {
    Scanner k=new Scanner(System.in);
    System.out.println("Enter 4 integer numbers");
    int a,b,c,d;
    a=k.nextInt();
    b=k.nextInt();
    c=k.nextInt();
    d=k.nextInt();
    if(a>b)
    {if(a>c)
      {if(a>d)
      {System.out.println("the greatest no. is  "+a);}
      else{System.out.println("the greatest no. is  "+d);}}
    else
    {if(c>d)
      {System.out.println("the greatest no. is  "+c);}
    else
    {System.out.println("the greatest no. is  "+d);}
    }
      }
    else
    {if(b>c)
      {if(b>d)
      {System.out.println("the greatest no. is  "+b);}
      else
      {System.out.println("the greatest no. is  "+d);}
    }
    else
    {if(c>d)
      {System.out.println("the greatest no. is  "+c);}
    else
    {System.out.println("the greatest no. is  "+d);}
    }
    }
  }
}
    
      
        
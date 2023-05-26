import java.util.Scanner;
public class Q1MA{
  public static void main(String[] args) {
    System.out.println("Enter Military Time");
    Scanner k=new Scanner (System.in);
    int x=k.nextInt();
    if(x>=1&&x<=10)
    {
      if(x<=3)
      {System.out.println(x+" MM");}
      else if(x>3&&x<7)
      {System.out.println(x-3+" DM");}
      else
        System.out.println(x-6+" NM");
    }
    else
      System.out.println("invalid");
  }
}
import java.util.Scanner;
public class Lab9Prob10{
  public static void main(String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.println("enter a number");
    int n=kb.nextInt();
    int i=1,c=0;
    for(i=1;i<=n;i++)
    {
      if(n%i==0){
        c++;
      }
    }
    if(c==2){
      System.out.println("PRIME");
    }
    else
      System.out.println("NOT PRIME");
  }
}
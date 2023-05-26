import java.util.Scanner;
public class Lab9Prob5{
  public static void main(String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.println("enter 20 numbers");
    for(int i=1;i<=20;i++){
      int n=kb.nextInt();
      if(n%2==0)
        System.out.println(n+" is even number");
      else
        System.out.println(n+" is odd number");
    }
  }
}
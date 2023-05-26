import java.util.Scanner;
public class starlab02{
  public static void main(String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.println("Enter a number");
    int input=kb.nextInt();
    for(int i=1;i<=input;i++)
      System.out.print("*");
    System.out.println();
  }
}
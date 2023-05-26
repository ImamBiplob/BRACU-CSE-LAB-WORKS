import java.util.Scanner;
public class P99{
  public static void main(String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.print("enter line limit");
    int input=kb.nextInt();
    int j=1;
    for(int i=1;i<=input;i++){
      for(j=1;j<i;j++)
      System.out.print(" ");
      for(int k=j;k<=j+(2*i-1);k++)
        System.out.print("*");
      System.out.println();
    }
  }
}
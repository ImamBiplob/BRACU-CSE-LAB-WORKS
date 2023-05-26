import java.util.Scanner;
public class P7{ //18301276
  public static void main(String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.print("enter line limit");
    int input=kb.nextInt();
    for(int i=1;i<=input;i++){
      for(int j=input;j>i;j--)
      System.out.print(" ");
      for(int k=1;k<=i;k++)
        System.out.print("*");
      System.out.println();
    }
  }
}
    
      
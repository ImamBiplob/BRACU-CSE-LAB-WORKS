import java.util.Scanner;
public class P20{ //18301276
  public static void main(String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.println("enter row limit");
    int input=kb.nextInt();
    for(int i=1;i<=input;i++){
      for(int j=input;j>=1;j--)
      {
        if(i==input)
          System.out.print("*");
        else if(j==i)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      for(int j=2;j<=input;j++)
      {
        if(j==i||i==input)
          System.out.print("*");
        else
          System.out.print(" ");
      }       
      System.out.println();
    }
  }
}
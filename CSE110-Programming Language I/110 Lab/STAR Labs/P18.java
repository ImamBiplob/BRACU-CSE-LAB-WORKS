import java.util.Scanner;
public class P18{ //18301276
  public static void main(String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.println("enter row and column limit");
    int input=kb.nextInt();
    for(int i=1;i<=input;i++){
      for(int j=input;j>=1;j--)
      {
        if(j==1||i==input)
          System.out.print("*");
        else if(j==i)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}
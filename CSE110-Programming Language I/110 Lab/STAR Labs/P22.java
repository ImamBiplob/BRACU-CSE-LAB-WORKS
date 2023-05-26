import java.util.Scanner;
public class P22{ //18301276
  public static void main(String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.println("enter the no. of star for each side of rhombus");
    int input=kb.nextInt();
    for(int i=1;i<=input;i++){
      for(int j=input;j>=1;j--)
      {
        if(j==i)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      for(int j=2;j<=input;j++)
      {
        if(j==i)
          System.out.print("*");
        else
          System.out.print(" ");
      }       
      System.out.println();
    }
    for(int i=2;i<=input;i++){
      for(int j=1;j<=input;j++){
      if(j==i)
        System.out.print("*");
      else
        System.out.print(" ");}
        for(int j=input-1;j>=1;j--){
          if(j==i)
          System.out.print("*");
          else
            System.out.print(" ");
        }
        System.out.println();
      }
    }
}

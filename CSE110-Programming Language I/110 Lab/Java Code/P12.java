import java.util.Scanner;
public class P12{ //18301276
  public static void main(String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.print("enter the no. of star in every side of rhombus");
    int input=kb.nextInt();
    int i,j,k,c;
    for(i=1;i<=input;i++){
      for(j=1;j<=input-i;j++)
      System.out.print(" ");
      for(k=1;k<=2*i-1;k++)
        System.out.print("*");
      System.out.println();
    }
    c=1;
    for(i=input-1;i>=1;i--)
    {
      for(j=1;j<=c;j++)
        System.out.print(" ");
      for(k=1;k<=2*i-1;k++)
        System.out.print("*");
      System.out.println();
      c++;
    }
  }
}
    
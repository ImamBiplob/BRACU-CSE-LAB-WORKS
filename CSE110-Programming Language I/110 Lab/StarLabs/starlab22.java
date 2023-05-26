import java.util.Scanner;
public class starlab22{
  public static void main(String[] args) {
    Scanner kb=new Scanner(System.in);
    System.out.println("Enter a number");
    int input=kb.nextInt();
    for(int i=1;i<=input;i++){
      for(int sp=1;sp<=input-i;sp++)
        System.out.print(" ");
      for(int j=1;j<=2*i-1;j++){
        if(j==1||j==2*i-1)
        System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
    int c=2*input-1;
    for(int i=2;i<=input;i++){
      c=c-2;
      for(int sp=1;sp<i;sp++)
        System.out.print(" ");
      for(int j=1;j<=c;j++){
        if(j==1||j==c)
        System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}
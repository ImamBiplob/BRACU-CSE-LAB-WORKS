import java.util.Scanner;
public class starlab09{
  public static void main(String[] args) {
    Scanner kb=new Scanner(System.in);
    System.out.println("Enter a number");
    int input=kb.nextInt();
    for(int i=1;i<=input;i++){
      for(int sp=1;sp<=input-i;sp++)
        System.out.print(" ");
      for(int j=1;j<=2*i-1;j++)
        System.out.print("*");
      System.out.println();
    }
  }
}
   
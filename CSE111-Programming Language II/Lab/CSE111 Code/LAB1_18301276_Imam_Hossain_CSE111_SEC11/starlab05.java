import java.util.Scanner;
public class starlab05{
  public static void main(String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.println("Enter row number");
    int input=kb.nextInt();
    for(int i=1;i<=input;i++){
      for(int j=1;j<=i;j++)
        System.out.print("*");
      System.out.println();
    }
  }
}

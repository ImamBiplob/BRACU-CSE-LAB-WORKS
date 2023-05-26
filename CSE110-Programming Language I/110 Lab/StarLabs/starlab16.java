import java.util.Scanner;
public class starlab16{
  public static void main(String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.println("Enter a Number");
    int input=kb.nextInt();
    for(int i=1;i<=input;i++){
      for(int j=1;j<=i;j++){
        if(i==1||i==input||j==1||j==i)
          System.out.print("*");
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}
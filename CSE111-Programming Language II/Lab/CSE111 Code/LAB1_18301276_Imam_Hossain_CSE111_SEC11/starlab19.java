import java.util.Scanner;
public class starlab19{
  public static void main(String[] args) {
    Scanner kb=new Scanner(System.in);
    System.out.println("Enter a number");
    int input=kb.nextInt();
    for(int i=input;i>=1;i--){
      for(int sp=1;sp<i;sp++)
        System.out.print(" ");
      for(int j=i;j<=input;j++){
        if(i==1||j==input||j==i)
        System.out.print(j);
        else
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}
import java.util.Scanner;
public class starlab04{
  public static void main(String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.println("Enter row number");
    int inp1=kb.nextInt();
    System.out.println("Enter column number");
    int inp2=kb.nextInt();
    for(int i=1;i<=inp1;i++){
      for(int j=1;j<=inp2;j++)
        System.out.print(j);
      System.out.println();
    }
  }
}

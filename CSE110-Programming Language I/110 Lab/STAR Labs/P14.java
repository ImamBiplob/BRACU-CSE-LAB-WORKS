import java.util.Scanner;
public class P14{ //18301276
  public static void main(String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.println("enter row limit");
    int inp1=kb.nextInt();
    System.out.println("enter column limit");
    int inp2=kb.nextInt();
    for(int i=1;i<=inp1;i++){
      for(int j=1;j<=inp2;j++)
        if(i==1||j==1||i==inp1||j==inp2)
        System.out.print("*");
      else
        System.out.print(" ");
      System.out.println();
    }
  }
}
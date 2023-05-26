import java.util.Scanner;
public class starlab14{
  public static void main(String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.println("Enter row number");
    int inp1=kb.nextInt();
    System.out.println("Enter column number");
    int inp2=kb.nextInt();
    for(int row=1;row<=inp1;row++){
      for(int cl=1;cl<=inp2;cl++){
      if(row==1||cl==1||row==inp1||cl==inp2)
        System.out.print("*");
      else
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
      
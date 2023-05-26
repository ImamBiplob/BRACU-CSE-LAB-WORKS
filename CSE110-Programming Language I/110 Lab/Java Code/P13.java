import java.util.Scanner;
public class P13{ //12301276
  public static void main(String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.print("enter the limit of every side of rhombus");
    int line=kb.nextInt();
    int count=line-1;
    for(int k=1;k<=line;k++)
    { 
      for(int i=1;i<=count;i++)
      {
        System.out.print(" ");
      }
      count--;
      for(int i=1;i<=2*k-1;i++)
      {
        System.out.print(i);
      }
      System.out.println();
    }
    count=1;
    for(int k=1;k<=line-1;k++)
    { 
      for(int i=1;i<=count;i++)
      {
        System.out.print(" ");
      }
      count++;
      for(int i=1;i<=2*(line-k)-1;i++)
      {
        System.out.print(i);
      }
      System.out.println();
    }
  }
}
              
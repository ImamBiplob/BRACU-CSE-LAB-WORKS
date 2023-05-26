import java.util.Scanner;
public class starlab08{
  public static void main(String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.println("Enter a number");
    int input=kb.nextInt();
    int c=0;
    for(int i=input;i>=1;i--) {
      ++c;
      for(int sp=1;sp<i;sp++)
        System.out.print(" ");
      for(int j=1;j<=c;j++)
        System.out.print(j);
      System.out.println();
    }
  }
}
   
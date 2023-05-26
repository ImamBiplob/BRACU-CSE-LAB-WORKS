import java.util.Scanner;
public class starlab25{
  public static void main(String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.println("Enter a number");
   int input=kb.nextInt();
   int j;
   for(int i=1;i<=input;i++){
     for(int sp=i;sp<=input-1;sp++)
       System.out.print(" ");
     for(j=1;j<=i;j++)
       System.out.print(j);
     for(int k=j-2;k>=1;k--)
       System.out.print(k);
     System.out.println();
   }
  }
}
     
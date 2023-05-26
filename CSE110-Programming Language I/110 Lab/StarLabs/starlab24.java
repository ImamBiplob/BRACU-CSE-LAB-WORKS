import java.util.Scanner;
public class starlab24{
  public static void main(String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.println("Enter a number");
   int input=kb.nextInt();
   for(int i=1;i<=5;i++){
     System.out.print(i);
   }
   for(int j=input-1;j>=1;j--){
       System.out.print(j);
   }
  }
}
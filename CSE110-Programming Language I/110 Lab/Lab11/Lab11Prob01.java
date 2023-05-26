import java.util.Scanner;
public class Lab11Prob01{
  public static void main(String[]args){
    Scanner kb=new Scanner(System.in);
    int a[]=new int[5];
    System.out.println("enter 5 numbers");
      a[0]=kb.nextInt();
    int max=a[0];
    for(int i=1;i<5;i++){
      a[i]=kb.nextInt();
      }
    for(int i=0;i<5;i++){
      if(a[i]>max){
        max=a[i];
      }
    }
    System.out.println(max);
  }
}
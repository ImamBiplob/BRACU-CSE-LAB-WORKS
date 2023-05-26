import java.util.Scanner;
public class Lab11Prob05{
  public static void main(String[]args){
    Scanner kb=new Scanner(System.in);
    int a[]=new int[5];
    System.out.println("enter 5 numbers");
    for(int i=0;i<5;i++){
      a[i]=kb.nextInt();
    }for(int i=0;i<5;i++){
      for(int j=0;j<a.length-1;j++){
        if(a[j]<a[j+1]){
          int temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
    }
    for(int i=0;i<5;i++){
      System.out.println(a[i]);
    }
  }
}
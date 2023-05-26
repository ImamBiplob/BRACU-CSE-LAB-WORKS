import java.util.Scanner;
public class Lab11Prob07{
  public static void main(String[]args){
    Scanner kb=new Scanner(System.in);
    int a[]=new int[10];
    System.out.println("enter 10 numbers");
    for(int i=0;i<10;i++){
      a[i]=kb.nextInt();
    }
   /* for(int i=0;i<10;i++){
      for(int j=0;j<a.length-1;j++){
        if(a[j]>a[j+1]){
          int temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
    }*/
    for(int i=0;i<a.length;i=i+2){
      System.out.print(a[i]);
     
    }
     System.out.println();
    for(int j=1;j<a.length;j=j+2){
      System.out.print(a[j]);
    }
  }
}
import java.util.Scanner;
public class Lab11Prob03{
  public static void main(String[]args){
    Scanner kb=new Scanner(System.in);
    int a[]=new int[5];
    System.out.println("enter 5 numbers");
      int j=0,k=0;
      int n=kb.nextInt();
      a[0]=n;
      int max=a[0];
      int min=a[0];
      for(int i=1;i<5;i++){
        a[i]=kb.nextInt();
      }
      for(int i=0;i<5;i++){
         if(a[i]>max){
          max=a[i];
          j=i;
        }
        else if(a[i]<min){
          min=a[i];
          k=i;
        }}
      System.out.println("Smallest no. "+min+" was found at location="+k);
      System.out.println("Largest no. "+max+" was found at location="+j);
  }
}

    
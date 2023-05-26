import java.util.Scanner;
public class Prob2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    int max=0,min=0,maxpos=0,minpos=0,temp;
    for(int i=0;i<=4;i++){
      a[i]=sc.nextInt();
    }
      max=a[0];
      min=a[0];
    for(int i=0;i<=4;i++){
      
      if(a[i]>max){
        max=a[i];
        maxpos=i;
      }
      else if (a[i]<min){
        min=a[i];
        minpos=i;
      }
    }
    temp=max;
    a[maxpos]=min;
    a[minpos]=temp;
    for(int i=0;i<5;i++){
      System.out.println(a[i]);
    }
  }
}
    
  
  
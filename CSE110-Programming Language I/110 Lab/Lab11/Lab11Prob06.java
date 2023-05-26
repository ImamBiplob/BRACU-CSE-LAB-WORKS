import java.util.Scanner;
public class Lab11Prob06{
  public static void main(String[]args){
    Scanner kb=new Scanner(System.in);
    System.out.println("Enter quantity of no.s");
    int q=kb.nextInt();
    int[]a=new int[q];
    System.out.println("Enter "+q+" numbers");
    for(int i=0;i<q;i++){
      a[i]=kb.nextInt();
    }
    for(int i=0;i<5;i++){
      for(int j=0;j<a.length-1;j++){
        if(a[j]>a[j+1]){
          int temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
    }
    int median;
    if(q%2!=0){
      median=a[q/2];
    }
    else
      median=(a[q/2]+a[q/2-1])/2;
    System.out.println(median);
  }
}
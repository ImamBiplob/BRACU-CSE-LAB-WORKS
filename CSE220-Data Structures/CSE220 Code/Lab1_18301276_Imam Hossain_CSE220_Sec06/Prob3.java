import java.util.Scanner;
public class Prob3 {
  public static void main(String [] args) {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    System.out.println("Enter Five Numbers");
    for(int i=0;i<5;i++) {
      a[i]=sc.nextInt();
    }
    int temp;
    for(int i=0;i<5;i++){
      for(int j=0;j<4;j++) {
        if(a[j+1]>a[j]) {
          temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
    }
    for(int i=0;i<5;i++) {
      System.out.println(a[i]);
    }
    for(int i=0;i<5;i++) {
      if(a[i]%2==0) {
        System.out.println(a[i]);
      }
    }
  }
}
                         

          
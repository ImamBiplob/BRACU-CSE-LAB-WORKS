import java.util.Scanner;
public class ass1 {
  public static void main(String[] args) {
    int a[]=new int[7];
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<7;i++){
      a[i]=sc.nextInt();
    }
    int temp=0,j=7-1;
    for(int i=0;i<=7/2;i++){
      temp=a[i];
      a[i]=a[j-i];
      a[j-i]=temp;
    }
    for(int i=0;i<7;i++)
      System.out.println(a[i]);
  }
}
      
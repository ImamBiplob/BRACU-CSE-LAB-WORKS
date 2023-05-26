import java.util.Scanner;
public class Lab10Prob13 {
  public static void main(String[] args) {
    int[]a=new int[10];
    Scanner kb=new Scanner(System.in);
    System.out.println("Enter 10 numbers");
    int sum1=0,sum2=0,sum3=0;
    for(int i=0;i<a.length;i++){
      a[i]=kb.nextInt();
      if(a[i]%2==0){
      sum1+=a[i];
      }
      else if(a[i]%5==0){
        sum2+=a[i];
        if(a[i]%2!=0)
          sum3+=a[i];
      }
      else
        sum3+=a[i];
    }
    System.out.println(sum1);
    System.out.println(sum2);
    System.out.println(sum3);
  }
}
    
import java.util.Scanner;
public class Prob11 {
  public static void allDigitsOdd(int n) {
    int m,a,c=0,counter=0;
    m=n;
    while(m>0){
     m=m/10;
     counter++;
    }
    for(int i=counter;i>0;i--) {
      a=n%10;
      if(a%2==0)
        c++;
      n=n/10;
    }
    if(c>0)
      System.out.println("False");
    else
      System.out.println("True");
  }
  public static void main(String []args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Number");
    int n=sc.nextInt();
    allDigitsOdd(n);
  }
}
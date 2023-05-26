import java.util.Scanner;
public class MpowerN {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Two Numbers for m and n");
    int m=sc.nextInt();
    int n=sc.nextInt();
    System.out.println("m^n : "+MPN(m,n));
  }
  public static int MPN(int m,int n) {
    if(n==0) return 1;
    return m*MPN(m,n-1);
  }
}
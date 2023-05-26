import java.util.Scanner;
public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    System.out.println(n+"th fibonacci no. is : "+fib(n));
  }
  public static int fib(int n) {
    if(n==1||n==2) return 1;
    return fib(n-1)+fib(n-2);
  }
}
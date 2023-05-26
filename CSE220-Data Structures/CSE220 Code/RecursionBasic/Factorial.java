import java.util.Scanner;
public class Factorial {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int f=sc.nextInt();
    System.out.println("Factorial of "+f+" : "+fact(f));
  }
  public static int fact(int f) {
    if(f==0||f==1) return 1;
    return f*fact(f-1);
  }
}
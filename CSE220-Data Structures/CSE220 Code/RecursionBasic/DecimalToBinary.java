import java.util.Scanner;
public class DecimalToBinary {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Decimal number");
    int n=sc.nextInt();
    String s="";
    System.out.println("Binary of "+n+" is : "+DTB(n,s));
  }
  public static String DTB(int n,String s) {
    if(n==0) return s;
    if(n%2==1) return DTB(n/2,"1"+s);
    return DTB(n/2,"0"+s);
  }
}
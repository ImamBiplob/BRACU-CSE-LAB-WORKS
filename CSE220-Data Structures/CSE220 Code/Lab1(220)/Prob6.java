import java.util.Scanner;
public class Prob6 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[5];
    for (int i=0;i<5;i++) {
      a[i]=sc.nextInt();
    }
    if(a[a.length/2-1]==a[a.length/2+1]&&a[a.length/2-2]==a[a.length/2+2])
      System.out.println("Palindrome");
    else
      System.out.println("Not Palindrome");
  }
}

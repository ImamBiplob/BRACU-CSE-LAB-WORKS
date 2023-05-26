import java.util.Scanner;
public class Prob8 {
  public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Dimension of Matrices");
    int dim =sc.nextInt();
    int a[]=new int[dim];
    int b[]=new int[dim];
    int c[]=new int[dim];
    System.out.println("Enter values for first Matrix");
    for (int i=0;i<a.length;i++) {
      a[i]=sc.nextInt();
    }
    System.out.println("Enter values for second Matrix");
    for (int i=0;i<b.length;i++) {
      b[i]=sc.nextInt();
    }
    for (int i=0;i<c.length;i++) {
      c[i]=5*a[i]-b[i];
      System.out.println(c[i]);
    }
  }
}
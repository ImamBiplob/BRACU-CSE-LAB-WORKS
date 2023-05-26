import java.util.Scanner;
public class lab2prob9 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 10 numbers");
    int array[]=new int[10];
    for(int i=0;i<array.length;i++){
      int n=sc.nextInt();
      array[i]=n;
    }
    for(int i=0;i<array.length;i=i+2)
      System.out.print(array[i]+" ");
    for(int i=1;i<array.length;i=i+2)
      System.out.print(array[i]+" ");
    System.out.println();
  }
}
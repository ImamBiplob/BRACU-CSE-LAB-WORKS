import java.util.Scanner;
public class lab2prob8 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 10 numbers without 0");
    int array[]=new int[10];
    for(int i=0;i<array.length;i++){
      int n=sc.nextInt();
      for(int j=0;j<i;j++){
        if(n==array[j]){
        System.out.println("print another number");
       n=sc.nextInt();
       array[i]=n;
        }
      }
      array[i]=n;
    }
    for(int i=0;i<array.length;i++)
      System.out.println(array[i]);
  }
}
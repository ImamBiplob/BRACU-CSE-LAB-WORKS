import java.util.Scanner;
public class lab2problem02 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 10 numbers");
    int array[]=new int[10];
    for(int i=0;i<array.length;i++){
      array[i]=sc.nextInt();
      System.out.print("you have entered :");
      for(int j=0;j<=i;j++){
        System.out.print(array[j]+", ");
      }
      System.out.println();
    }
  }
}
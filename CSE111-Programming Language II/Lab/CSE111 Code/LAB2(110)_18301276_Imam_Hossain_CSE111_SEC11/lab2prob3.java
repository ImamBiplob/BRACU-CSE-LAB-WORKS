import java.util.Scanner;
public class lab2prob3 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int array[] =new int[10];
    System.out.println("enter 10 numbers");
    for (int i=0;i<array.length;i++){
      array[i]=sc.nextInt();
    }
    for(int i=9;i>=0;i--){
      System.out.println(array[i]);
    }
  }
}
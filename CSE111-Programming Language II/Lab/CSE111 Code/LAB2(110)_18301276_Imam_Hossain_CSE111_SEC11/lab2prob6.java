import java.util.Scanner;
public class lab2prob6 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 15 numbers");
    int array[]=new int[10];
    for(int i=0;i<15;i++){
      int n=sc.nextInt();
      if(n>=0&&n<=9)
        array[n]++;
    }
    for(int i=0;i<array.length;i++){
      System.out.println(i+"="+array[i]);
    }
  }
}
    
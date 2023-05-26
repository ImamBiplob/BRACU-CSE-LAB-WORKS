import java.util.Scanner;
public class lab2prob5 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 10 numbers");
    int array[]=new int[10];
    for(int i=0;i<array.length;i++){
      array[i]=sc.nextInt();
    }
    System.out.println("Enter another number");
    int n=sc.nextInt();
    int j=0;
    for(int i=0;i<array.length;i++) {
      if(array[i]==n){
        j++;
        break;}
      }
    if(j==1)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
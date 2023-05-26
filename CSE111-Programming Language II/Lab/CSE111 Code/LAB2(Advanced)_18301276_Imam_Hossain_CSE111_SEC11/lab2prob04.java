import java.util.Scanner;
public class lab2prob04 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 5 numbers");
    int array[]=new int[5];
    loop1:
    for(int i=0;i<array.length;i++){
      int n=sc.nextInt();
      loop2:
      for(int j=0;j<i;j++){
        if(n==array[j]){
        System.out.println(n+" is already taken, print another number");
        i-=1;
          continue loop1;
       }
      }
      array[i]=n;
    }
    for(int i=0;i<array.length;i++)
      System.out.println(array[i]);
  }
}
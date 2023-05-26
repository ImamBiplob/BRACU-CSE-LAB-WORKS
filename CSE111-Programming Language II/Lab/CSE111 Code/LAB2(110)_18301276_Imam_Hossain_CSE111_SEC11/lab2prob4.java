import java.util.Scanner;
public class lab2prob4 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 20 numbers");
    int array[]=new int[20];
    for(int i=0;i<array.length;i++){
      array[i]=sc.nextInt();
    }
    for(int i=19;i>=0;i--){
      if(array[i]%2==0){
        System.out.println(array[i]);
      }
    }
  }
}
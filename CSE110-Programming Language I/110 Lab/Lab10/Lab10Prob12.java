import java.util.Scanner;
public class Lab10Prob12 {
  public static void main(String[] args) {
    int[]a=new int[10];
    Scanner kb=new Scanner(System.in);
    System.out.println("Enter 10 numbers");
    for(int i=0;i<a.length;i++){
      a[i]=kb.nextInt();
     
    }
    for(int i=0;i<a.length;i++){
       if(a[i]%2==0){
        System.out.print(a[i]);
        System.out.println("  "+i);
      }
    }
  }
}
      
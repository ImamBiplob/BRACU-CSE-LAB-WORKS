import java.util.Scanner;
public class Lab10Prob1 {
  public static void main(String[] args) {
    Scanner kb=new Scanner(System.in);
    int sum=0;
    int []a=new int[3];
    System.out.println("Enter three numbers");
    for(int i=0;i<a.length;i++){
      a[i]=kb.nextInt();
      sum+=a[i];
    }
    System.out.println(sum);
    for(int i=0;i<3;i++){
      System.out.println(a[i]);
    }
  }
}
    
    
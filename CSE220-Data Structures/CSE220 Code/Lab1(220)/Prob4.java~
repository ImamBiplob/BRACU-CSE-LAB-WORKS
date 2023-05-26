import java.util.Scanner;
public class Prob4 {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter Ten Numbers");
    int a[]=new int[10];
    a[0]=sc.nextInt();
    outer:
    for(int i=1;i<a.length;i++){
      int n=sc.nextInt();
      for(int j=0;j<i;j++){
        if(n==a[j]){
          System.out.println(n+" is already in among the entered numbers. Enter a different number.");
          i--;
          continue outer;
        }
      }
      a[i]=n;
    }
  }
}
                   
import java.util.Scanner;
public class HP2 {
  public static void main(String[] args) {
    Scanner k=new Scanner(System.in);
        int i,j,n;
        n=k.nextInt();
    for(i=1;i<=n;i++){
      for(j=n;j>=1;j--){
      if(j<=i)
      System.out.print(j);
    else
      System.out.print(" "); 
      }
      System.out.println();
    }
  }
}

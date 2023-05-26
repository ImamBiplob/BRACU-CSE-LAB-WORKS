import java.util.Scanner;
public class Lab10Prob11 {
  public static void main(String[] args) {
    int[]a=new int[10];
    Scanner kb=new Scanner(System.in);
    System.out.println("Enter 10 numbers");
    boolean isDuplicate;
    for(int i=0;i<10;i++){
      int n;
      do{
        isDuplicate=false;
        n=kb.nextInt();
        for(int j=0;j<i;j++){
          if(a[j]==n){
            System.out.println("Enter a different number");
            isDuplicate=true;
            break;
          }
        }
      }while(isDuplicate);
      a[i]=n;
    }
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+" ");
  }
}
}

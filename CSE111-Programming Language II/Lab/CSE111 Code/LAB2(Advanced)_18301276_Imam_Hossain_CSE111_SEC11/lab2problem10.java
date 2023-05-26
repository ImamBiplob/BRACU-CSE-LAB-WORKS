import java.util.Scanner;
public class lab2problem10 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter numbers within 0 to 9");
    int a[]=new int[10];
    int c=0;
      do{
      int n=sc.nextInt();
      a[n]++;
      if(a[n]==4)
        break;
    }
    while(true);
      for(int i=0;i<a.length;i++){
        if(a[i]>1){
          System.out.println(i);
          c++;
        }
        if(c==2)
          break;
        else
          continue;
      }
  }
}
    
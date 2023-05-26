import java.util.Scanner;
public class Quiz1 {
  public static void main(String []args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter length of an array");
    int length=sc.nextInt();
    int a[]=new int[length];
    int n,c=0;
    loop1:
    for(int i=0;i<length;i++) {
      c=0;
      n =sc.nextInt();
      for(int k=1;k<=n;k++){
        if(n%k==0)
          c++;
      }
      if(c!=2){
        System.out.println("It's not a prime number, enter another number");
        i--;
        continue loop1;
      }
      else{
        for(int j=0;j<i;j++) {
          if(n==a[j]){
            System.out.println("Number is already taken, Enter another number");
            i--;
            continue loop1;
          }
        }
      }
        
        a[i]=n;
    }
    for(int i=0;i<length;i++){
      System.out.println(a[i]);
    }
    
  }
}
      
        
        
            
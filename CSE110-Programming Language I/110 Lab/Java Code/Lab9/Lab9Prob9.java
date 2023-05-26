import java.util.Scanner;
public class Lab9Prob9{
  public static void main(String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.println("enter a number");
    int n=kb.nextInt();
    int i=1,sum=0;
    for(i=1;i<n;i++){
      if(n%i==0){
        sum+=i;}
    }
    if(sum==n)
      System.out.println("Perfect");
    else
      System.out.println("Not Perfect");
  }
}

     
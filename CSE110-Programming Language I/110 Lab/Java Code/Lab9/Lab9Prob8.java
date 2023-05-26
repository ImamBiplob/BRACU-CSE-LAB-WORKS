import java.util.Scanner;
public class Lab9Prob8{
  public static void main(String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.println("enter a number");
    int n=kb.nextInt();
    int i=1,c=0;
    for(i=1;i<=n;i++){
      if(n%i==0){
        System.out.println(i);
        c++;
      }
    }
    System.out.println("tolal "+c+" divisors");
  }
}
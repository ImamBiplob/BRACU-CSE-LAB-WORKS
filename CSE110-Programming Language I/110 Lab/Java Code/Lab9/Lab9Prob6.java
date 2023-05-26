import java.util.Scanner;
public class Lab9Prob6{
  public static void main(String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.println("enter quantity of no.s");
    int quant=kb.nextInt();
    int []a=new int[quant];
    System.out.println("enter "+quant+" numbers");
    for(int i=0;i<quant;i++){
      a[i]=kb.nextInt();}
    for(int j=0;j<quant;j++){
      if(a[j]%2==0)
        System.out.println(a[j]+" is even number");
      else
        System.out.println(a[j]+" is odd number");
    }
  }
}
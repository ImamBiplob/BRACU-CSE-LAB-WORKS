import java.util.Scanner;
public class Lab9Prob7{
  public static void main(String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.println("enter quantity of no.s");
    int quant=kb.nextInt();
    int []a=new int[quant];
    System.out.println("enter "+quant+" numbers");
    a[0]=kb.nextInt();
    int max=a[0],min=a[0],avg=0,sum=0;
    for(int i=1;i<quant;i++){
      a[i]=kb.nextInt();}
    for(int j=0;j<quant;j++){
      if(a[j]>max)
        max=a[j];
      else if(a[j]<min)
        min=a[j];
      sum+=a[j];
    }
    System.out.println("Maximum no. is "+max);
    System.out.println("Minimum no. is "+min);
    avg=sum/quant;
    System.out.println("Average is "+avg);
  }
}
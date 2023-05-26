import java.util.Scanner;
public class AvgMark {
  public static void main (String[] args) {
    System.out.println("enter the quantity of marks");
    Scanner k=new Scanner(System.in);
    float n=k.nextFloat();
    float i=0,j=0;float avg,sum=0,per;
    float c=1;
    while(c<=n){
      System.out.println("enter the marks");
      float m=k.nextFloat();
      if(m>=1&&m<=100) {
        sum=sum+m;
        i++;}
      else
      {j++;}
      c++;
    }
    avg=sum/i;
    per=j/n*100;
    System.out.println("Average:"+ avg);
    System.out.println("Invalid(%):"+ per);
  }
}

import java.util.Scanner;
public class fq2{
  public static void main(String[] args){
    Scanner kb=new Scanner(System.in);
    System.out.println("enter quantity of numbers(at least 4)");
    int q=kb.nextInt();
    int a[]=new int[q];
    for(int i=0;i<q;i++){
      a[i]=kb.nextInt();
    }
    for(int i=0;i<q;i++){
      for(int j=0;j<q-1;j++){
        int temp=0;
        if(a[j]>a[j+1]){
        temp=a[j];
        a[j]=a[j+1];
        a[j+1]=temp;
        }
      }
    }
    int div,sum=0;double avg;
    if(q%2==0){
      div=q/4;
      if(q%4!=0&&q>6){
        for(int i=div+1;i<q-(div+1);i++)
          sum=sum+a[i];}
        else if(q==4){
          for(int i=1;i<q;i++)
            sum=sum+a[i];
        }
        else{
        for(int i=div;i<q-div;i++)
          sum=sum+a[i];}
        avg=sum/4.0;
    }
        else{
          div=q/3;
          for(int i=div;i<q-div;i++){
            sum=sum+a[i];}
          avg=sum/3.0;
        }
    for(int i=0;i<q;i++){
      System.out.println(a[i]);
    }
   System.out.println(avg); 
  }
}
        
      
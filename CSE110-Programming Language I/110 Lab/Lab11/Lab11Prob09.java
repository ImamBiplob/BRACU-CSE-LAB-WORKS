import java.util.Scanner;
public class Lab11Prob09{
  public static void main(String[]args){
    Scanner kb=new Scanner(System.in);
    int a[]=new int[10];
    for(int i=0;i<15;i++){
    int num=kb.nextInt();
    if(num>=0&&num<=10){
      a[num]++;
    }
    }    
    for(int i=0;i<10;i++){
      System.out.println(i+" "+a[i]);
    }
  }
}
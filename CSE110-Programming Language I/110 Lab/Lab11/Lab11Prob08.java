import java.util.Scanner;
public class Lab11Prob08{
  public static void main(String[]args){
    String s[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    int n;
    Scanner kb=new Scanner(System.in);
    for(int i=0;i<10;i++){
      n=kb.nextInt();
      System.out.println(s[n]);
    }
  }
}


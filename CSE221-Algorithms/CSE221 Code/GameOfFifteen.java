import java.util.Scanner;
public class GameOfFifteen {
  public static void main(String[] args) {
    int n,p,fnc;
    int m = 15;
    int k = (int)Math.pow(10,2);
    Scanner sc = new Scanner(System.in);
    while(true){
      n = sc.nextInt();
      if(n>=0&&n<=(int)(Math.pow(10,18))){
        break;
      }
    }
    fnc = (int)Math.pow(m,n);
    p = fnc%k;
    System.out.println(p);
    sc.close();
  }
}
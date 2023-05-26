import java.util.Scanner;
public class Task02 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    int len=str.length();
    char[] chara=new char[len];
    for(int i=0;i<len;i++) {
      chara[i]=str.charAt(i);
      System.out.println(chara[i]);
    }
  }
}
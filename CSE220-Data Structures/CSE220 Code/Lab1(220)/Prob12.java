import java.util.Scanner;
public class Prob12 {
  public static void before(int month1,int day1,int month2,int day2) {
    if(month1<month2)
      System.out.println("True");
    else if(month1==month2){
      if(day1<day2)
        System.out.println("True");
      else 
        System.out.println("False");
    }
    else
      System.out.println("False");
  }
                             
  public static void main(String []args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter month and day respectively for two times");
    int month1=sc.nextInt();
    int day1=sc.nextInt();
    int month2=sc.nextInt();
    int day2=sc.nextInt();
    before(month1,day1,month2,day2);
  }
}
  
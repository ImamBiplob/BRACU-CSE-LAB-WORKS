import java.util.Scanner;
public class lab2problem05 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of voltage");
    double e=sc.nextInt();
    System.out.println("enter the value of resistance");
    double r=sc.nextInt();
    System.out.println("enter the value of inductance");
    double l=sc.nextInt();
    System.out.println("enter the value of capacitance");
    double c=sc.nextInt();
    System.out.println("enter the value of frequency");
    double f=sc.nextInt();
    double I=0;
    I=e/Math.sqrt(r*r+(2*Math.PI*f*l-1/(2*Math.PI*f*c))*(2*Math.PI*f*l-1/(2*Math.PI*f*c)));
    System.out.println("Current is "+I+" Ampere");
  }
}

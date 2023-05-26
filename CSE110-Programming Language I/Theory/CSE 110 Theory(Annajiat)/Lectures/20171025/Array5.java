import java.util.Scanner;
public class Array5 {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in);
            int i;
            System.out.print("kotogulo?");
            int quantity = sc.nextInt();
            int[] a = new int [quantity]; //a[0],a[1],a[2]
            for (i=0 ; i < a.length ; ++i) {
                  System.out.print("Please type value of a["+i+"]=");
                 a[i] = sc.nextInt();
            }
            int boroSoFar = a[0];
            for (i=1 ; i<a.length ; ++i) {
                  if (a[i] > boroSoFar) {
                        boroSoFar = a[i];
                  }
            }
            System.out.println("boroSoFar = "+boroSoFar);

      }
}
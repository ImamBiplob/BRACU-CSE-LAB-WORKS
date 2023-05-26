import java.util.Scanner;
public class Array6 {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in);
            int i;
            System.out.print("kotogulo?");
            int poriman = sc.nextInt();
            int[] a = new int [poriman]; //a[0],a[1],a[2]
            for (i=0 ; i < a.length ; ++i) {
                  System.out.print("Please type value of a["+i+"]=");
                 a[i] = sc.nextInt();
            }
            //int boroSoFar = a[0];
            int jogfol = 0;
            for (i=0 ; i<a.length ; ++i) {
                  jogfol += a[i];
            }
            System.out.println("jogfol = "+jogfol);
            double avg = (double)jogfol/poriman;//1/2 = 0*1.0=0.0
            System.out.println("avg = "+avg);
      }
}
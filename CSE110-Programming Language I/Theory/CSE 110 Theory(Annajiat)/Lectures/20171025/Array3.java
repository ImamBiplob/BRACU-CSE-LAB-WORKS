import java.util.Scanner;
public class Array3 {
      public static void main (String[] args) {
            Scanner sc = new Scanner (System.in);
            int i;
            int[] a = new int [3]; //a[0],a[1],a[2]
            for (i=0 ; i < a.length ; ++i) {
                  System.out.print("Please type value of a["+i+"]=");
                 a[i] = sc.nextInt();
            }
            System.out.print("konta?");
            int eita = sc.nextInt();
            System.out.print(a[eita]);

      }
}
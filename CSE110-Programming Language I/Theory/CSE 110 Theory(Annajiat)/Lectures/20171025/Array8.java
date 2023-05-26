import java.util.Scanner;
public class Array8 {
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
            System.out.print("konta?");
            int nikhoj = sc.nextInt();
            boolean peyechi = false;
            int thikana = 0;
            for (i=0 ; i<a.length ; ++i) {
                  if (a[i] == nikhoj) {
                        peyechi = true;
                        thikana = i;
                  } 
            }
            if (peyechi) {
                  System.out.println("peyechi: "+a[thikana]+" at "+thikana);
            } else {
                  System.out.println("paini");
            }
            //System.out.println("chotoSoFar = "+chotoSoFar);
      }
}
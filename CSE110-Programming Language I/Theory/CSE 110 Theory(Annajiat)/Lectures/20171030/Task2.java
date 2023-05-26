//Sorting means arranging elements, usually done in two ways:
//ascending:Low to high,first to last,small to large,a-z,lexicographically
//descending:high to low,last to first,large to small,z-a,vice versa
public class Task2 { //Sorting in descending order
      public static void main (String[] args) {
            //          0  1  2  3  4
            int[] a = {50,30,10,20,40}; 
            int i;
            int boroSoFar = a[1];//30;
            int boroLocation = 1;
            for (i=2; i<a.length; ++i) {
                  if (a[i] > boroSoFar) {
                        boroSoFar = a[i];
                        boroLocation = i;
                  }
            }
            System.out.print("boroSoFar = "+boroSoFar);
            System.out.println(", boroLocation = "+boroLocation);
            int icu = a[1]; //backup a[1]=30 to icu
            a[1] = boroSoFar;//copy 40 to a[1], overwriting 30
            a[boroLocation] = icu;//copy 30 from icu to a[4],overwriting 40
            for (i=0; i<a.length; ++i) {
                  System.out.print(a[i]+",");
            }
            
      }
}

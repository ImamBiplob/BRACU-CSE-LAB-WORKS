//Sorting means arranging elements, usually done in two ways:
//ascending:Low to high,first to last,small to large,a-z,lexicographically
//descending:high to low,last to first,large to small,z-a,vice versa
public class Task4 { //Sorting in descending order
      public static void main (String[] args) {
            //          0  1  2  3  4
            int[] a = {50,40,30,10,20}; 
            int i;
            int boroSoFar = a[3];//10;
            int boroLocation = 3;
            for (i=4; i<a.length; ++i) {
                  if (a[i] > boroSoFar) {
                        boroSoFar = a[i];
                        boroLocation = i;
                  }
            }
            System.out.print("boroSoFar = "+boroSoFar);
            System.out.println(", boroLocation = "+boroLocation);
            int icu = a[3]; //backup a[3]=10 to icu
            a[3] = boroSoFar;//copy 20 to a[3], overwriting 10
            a[boroLocation] = icu;//copy 10 from icu to a[4],overwriting 20
            for (i=0; i<a.length; ++i) {
                  System.out.print(a[i]+",");
            }
            
      }
}

//Sorting means arranging elements, usually done in two ways:
//ascending:Low to high,first to last,small to large,a-z,lexicographically
//descending:high to low,last to first,large to small,z-a,vice versa
public class Task3 { //Sorting in descending order
      public static void main (String[] args) {
            //          0  1  2  3  4
            int[] a = {50,40,10,20,30}; 
            int i;
            int boroSoFar = a[2];//10;
            int boroLocation = 2;
            for (i=3; i<a.length; ++i) {
                  if (a[i] > boroSoFar) {
                        boroSoFar = a[i];
                        boroLocation = i;
                  }
            }
            System.out.print("boroSoFar = "+boroSoFar);
            System.out.println(", boroLocation = "+boroLocation);
            int icu = a[2]; //backup a[2]=10 to icu
            a[2] = boroSoFar;//copy 30 to a[2], overwriting 10
            a[boroLocation] = icu;//copy 10 from icu to a[4],overwriting 30
            for (i=0; i<a.length; ++i) {
                  System.out.print(a[i]+",");
            }
            
      }
}

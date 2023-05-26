//Sorting means arranging elements, usually done in two ways:
//ascending:Low to high,first to last,small to large,a-z,lexicographically
//descending:high to low,last to first,large to small,z-a,vice versa
public class Task1 { //Sorting in descending order
      public static void main (String[] args) {
            //          0  1  2  3  4
            int[] a = {10,30,50,20,40}; 
            int i;
            int boroSoFar = a[0];//10;
            int boroLocation = 0;
            for (i=1; i<a.length; ++i) {
                  if (a[i] > boroSoFar) {
                        boroSoFar = a[i];
                        boroLocation = i;
                  }
            }
            System.out.print("boroSoFar = "+boroSoFar);
            System.out.println(", boroLocation = "+boroLocation);
            int icu = a[0]; //backup a[0]=10 to icu
            a[0] = boroSoFar;//copy 50 to a[0]
            a[boroLocation] = icu;//copy 10 from icu to a[2]
            for (i=0; i<a.length; ++i) {
                  System.out.print(a[i]+",");
            }
            
      }
}

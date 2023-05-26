//Sorting means arranging elements, usually done in two ways:
//ascending:Low to high,first to last,small to large,a-z,lexicographically
//descending:high to low,last to first,large to small,z-a,vice versa
public class TaskCommon { //Sorting in descending order
      public static void main (String[] args) {
            //          0  1  2  3  4
            int[] a = {10,30,50,20,40}; 
            int i;
            
            for(int v=0; v<=a.length-2; ++v) {
                  int boroSoFar = a[v];//10;
                  int boroLocation = v;
                  for (i=v+1; i<a.length; ++i) {
                        if (a[i] > boroSoFar) {
                              boroSoFar = a[i];
                              boroLocation = i;
                        }
                  }
//                  System.out.print("boroSoFar = "+boroSoFar);
//                  System.out.println(", boroLocation = "+boroLocation);
                  int icu = a[v]; //backup a[3]=10 to icu
                  a[v] = boroSoFar;//copy 40 to a[3], overwriting 10
                  a[boroLocation] = icu;//copy 10 from icu to a[4],overwriting 20
            }
            
            for (i=0; i<a.length; ++i) {
                  System.out.print(a[i]+",");
            }
            
      }
}

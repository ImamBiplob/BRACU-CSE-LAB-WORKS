//sorting means to arrange elements, mostly in two ways
//ascending:first to last, low to high, small to large, a-z, lexicographically
//descending:last to first, high to low, large to small,z-a,vice versa..
public class LearningSortCommon {
      public static void main (String[] args) { //descedning order
            //          0  1  2  3  4 //index / offset / location / serialNo      
            int[] a = {11,33,55,22,40};
            int c;
            for(int v=0; v<a.length-1; ++v) {
                  int boroSoFar = a[v];//11
                  int boroLocation = v;
                  
                  for (c=v+1 ; c<a.length ; ++c) {
                        if (a[c] > boroSoFar) {//a[1]=33 > boroSoFar=11
                              boroSoFar = a[c];//copy 33 to boroSoFar replacing 11
                              boroLocation = c;
                        }
                  }
//                  System.out.println("boroSoFar="+boroSoFar+" found at "+boroLocation);
                  int icu = a[v]; //back up 11 from a[0] to icu
                  a[v] = boroSoFar;//copies 55 to a[0] replacing 11
                  a[boroLocation] = icu;//copy 11 from icu to a[2]
            }
            
            for(c=0; c<a.length; ++c) {
                  System.out.print(a[c]+" ");
            }
      }
}
//sorting means to arrange elements, mostly in two ways
//ascending:first to last, low to high, small to large, a-z, lexicographically
//descending:last to first, high to low, large to small,z-a,vice versa..
public class LearningSort1 {
      public static void main (String[] args) { //descedning order
            //          0  1  2  3  4 //index / offset / location / serialNo      
            int[] a = {11,33,55,22,44};
            int boroSoFar = a[0];//11
            int boroLocation = 0;
            int c;
            for (c=1 ; c<a.length ; ++c) {
                  if (a[c] > boroSoFar) {
                        boroSoFar = a[c];
                        boroLocation = c;
                  }
            }
            System.out.println("boroSoFar="+boroSoFar+" found at "+boroLocation);
            int icu = a[0]; //backup 11 from a[0];
            a[0] = boroSoFar;//copies 55 to a[0] replacing 11
            a[boroLocation] = icu; //copying 11 from icu to a[2];
            for(c=0; c<a.length; ++c) {
                  System.out.print(a[c]+" ");
            }
      }
}
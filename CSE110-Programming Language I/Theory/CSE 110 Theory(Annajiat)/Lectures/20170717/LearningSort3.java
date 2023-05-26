//sorting means to arrange elements, mostly in two ways
//ascending:first to last, low to high, small to large, a-z, lexicographically
//descending:last to first, high to low, large to small,z-a,vice versa..
public class LearningSort3 {
      public static void main (String[] args) { //descedning order
            //          0  1  2  3  4 //index / offset / location / serialNo      
            int[] a = {55,44,11,22,33};
            int boroSoFar = a[2];//11
            int boroLocation = 2;
            int c;
            for (c=3 ; c<a.length ; ++c) {
                  if (a[c] > boroSoFar) {
                        boroSoFar = a[c];
                        boroLocation = c;
                  }
            }
            System.out.println("boroSoFar="+boroSoFar+" found at "+boroLocation);
            int icu = a[2]; //backup 11 from a[2];
            a[2] = boroSoFar;//copies 33 to a[2] replacing 11
            a[boroLocation] = icu; //copying 11 from icu to a[4] replacing 33;
            for(c=0; c<a.length; ++c) {
                  System.out.print(a[c]+",");
            }
      }
}
//sorting means to arrange elements, mostly in two ways
//ascending:first to last, low to high, small to large, a-z, lexicographically
//descending:last to first, high to low, large to small,z-a,vice versa..
public class LearningSort4 {
      public static void main (String[] args) { //descedning order
            //          0  1  2  3  4 //index / offset / location / serialNo      
            int[] a = {55,44,33,11,22};
            int boroSoFar = a[3];//11
            int boroLocation = 3;
            int c;
            for (c=4 ; c<a.length ; ++c) {
                  if (a[c] > boroSoFar) {
                        boroSoFar = a[c];
                        boroLocation = c;
                  }
            }
            System.out.println("boroSoFar="+boroSoFar+" found at "+boroLocation);
            int icu = a[3]; //backup 11 from a[3];
            a[3] = boroSoFar;//copies 22 to a[3] replacing 11
            a[boroLocation] = icu; //copying 11 from icu to a[4] replacing 22;
            for(c=0; c<a.length; ++c) {
                  System.out.print(a[c]+",");
            }
      }
}
//sorting means to arrange elements, mostly in two ways
//ascending:first to last, low to high, small to large, a-z, lexicographically
//descending:last to first, high to low, large to small,z-a,vice versa..
public class LearningSort2 {
      public static void main (String[] args) { //descedning order
            //          0  1  2  3  4 //index / offset / location / serialNo      
            int[] a = {55,33,11,22,44};
            int boroSoFar = a[1];//33
            int boroLocation = 1;
            int c;
            for (c=2 ; c<a.length ; ++c) {
                  if (a[c] > boroSoFar) {
                        boroSoFar = a[c];
                        boroLocation = c;
                  }
            }
            System.out.println("boroSoFar="+boroSoFar+" found at "+boroLocation);
            int icu = a[1]; //backup 33 from a[1];
            a[1] = boroSoFar;//copies 44 to a[1] replacing 33
            a[boroLocation] = icu; //copying 33 from icu to a[4] replacing 44;
            for(c=0; c<a.length; ++c) {
                  System.out.print(a[c]+",");
            }
      }
}
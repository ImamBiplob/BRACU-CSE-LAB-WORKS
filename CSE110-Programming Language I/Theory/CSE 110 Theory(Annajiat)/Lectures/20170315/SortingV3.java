//sort: to arrange elements
//ascending order:low to high,small to large,first to last,lexicographically:a-z
//descending order:high to low,large to small,last to first,z-a
public class SortingV3 { //ascending
      public static void main (String[] args) {
            int count;
            //         0  1  2   3  4
            int[] a = {10,20,50,30,40};
            int chotoSoFar = a[2];//50
            int chotoLocation = 2;//location of a[2]=50
            for(count=3 ; count<a.length; ++count) {
                  if(a[count] < chotoSoFar) {//10 < 30
                        chotoSoFar = a[count];//copy 10 to chotoSoFar
                        chotoLocation = count;//note 2 as location of a[2]=10
                  }
            }
            System.out.println(chotoSoFar+" found at "+chotoLocation);
            int icu = a[2];//backup 50 from a[0] to icu
            a[2] = chotoSoFar;//copy 50 from chotoSoFar to a[0] replacing 50
            a[chotoLocation] = icu;//copy 50 from icu to a[2] replacing 10
            for(count=0; count<a.length; ++count) {
                  System.out.print(a[count] + " ");
            }
      }
}
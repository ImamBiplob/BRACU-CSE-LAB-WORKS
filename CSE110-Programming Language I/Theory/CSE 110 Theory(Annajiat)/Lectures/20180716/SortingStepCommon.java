//sorting means arraning elements
//Ascending: low to high,small to large,first to last,a-z,lexicographically
//Descending: high to low,large to small, last to first,z-a 
class SortingStepCommon {//descending order (HW: ascending order)
    public static void main (String[] args) {
        //        0   1   2   3   4
        int[] a={10, 30, 50, 20, 40};
        int v = 0;
        while (v < a.length-1) {
            int boroSoFar = a[v]; // 10
            int boroLocation = v;
            int i = v+1;
            while (i < a.length) {
                if (a[i] > boroSoFar) {//a[4]=40 > 50
                    boroSoFar = a[i];//
                    boroLocation = i;//
                }
                ++i;
            }
            int icu = a[v]; //backup 10 from a[0] to icu
            a[v] = boroSoFar; //copy 50 to a[0] overwriting 10
            a[boroLocation] = icu; // copy 10 to location of 50, a[2]
            ++v;
        }        
        int i = 0;
        while (i < a.length) {
            System.out.print(a[i]+", ");
           ++i;
        }
    }
}
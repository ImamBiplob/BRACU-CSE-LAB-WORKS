//sorting means arraning elements
//Ascending: low to high,small to large,first to last,a-z,lexicographically
//Descending: high to low,large to small, last to first,z-a 
class SortingStep2 {//descending order (HW: ascending order)
    public static void main (String[] args) {
        //        0   1   2   3   4
        int[] a={50, 30, 10, 20, 40};
        int boroSoFar = a[1]; // 30
        int boroLocation = 1;
        int i = 2;
        while (i < a.length) {
            if (a[i] > boroSoFar) {//a[4]=40 > 50
               boroSoFar = a[i];//
               boroLocation = i;//
            }
           ++i;
        }
        System.out.println("boroSoFar = "+boroSoFar+" found at "+boroLocation);
        int icu = a[1]; //backup 30 from a[1] to icu
        a[1] = boroSoFar; //copy 40 to a[1] overwriting 30
        a[boroLocation] = icu; // copy 30 to location of 40, a[4]
        i = 0;
        while (i < a.length) {
            System.out.print(a[i]+", ");
           ++i;
        }
    }
}
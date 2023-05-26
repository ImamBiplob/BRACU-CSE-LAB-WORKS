//sorting means arraning elements
//Ascending: low to high,small to large,first to last,a-z,lexicographically
//Descending: high to low,large to small, last to first,z-a 
class SortingStep4 {//descending order (HW: ascending order)
    public static void main (String[] args) {
        //        0   1   2   3   4
        int[] a={50, 40, 30, 10, 20};
        int boroSoFar = a[3]; // 10
        int boroLocation = 3;
        int i = 4;
        while (i < a.length) {
            if (a[i] > boroSoFar) {//a[4]=40 > 50
               boroSoFar = a[i];//
               boroLocation = i;//
            }
           ++i;
        }
        System.out.println("boroSoFar = "+boroSoFar+" found at "+boroLocation);
        int icu = a[3]; //backup 10 from a[3] to icu
        a[3] = boroSoFar; //copy 20 to a[3] overwriting 10
        a[boroLocation] = icu; // copy 10 to location of 20, a[4]
        i = 0;
        while (i < a.length) {
            System.out.print(a[i]+", ");
           ++i;
        }
    }
}
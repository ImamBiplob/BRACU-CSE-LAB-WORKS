//sorting means arraning elements
//Ascending: low to high,small to large,first to last,a-z,lexicographically
//Descending: high to low,large to small, last to first,z-a 
class SortingStep3 {//descending order (HW: ascending order)
    public static void main (String[] args) {
        //        0   1   2   3   4
        int[] a={50, 40, 10, 20, 30};
        int boroSoFar = a[2]; // 10
        int boroLocation = 2;
        int i = 3;
        while (i < a.length) {
            if (a[i] > boroSoFar) {//a[4]=40 > 50
               boroSoFar = a[i];//
               boroLocation = i;//
            }
           ++i;
        }
        System.out.println("boroSoFar = "+boroSoFar+" found at "+boroLocation);
        int icu = a[2]; //backup 10 from a[2] to icu
        a[2] = boroSoFar; //copy 30 to a[2] overwriting 10
        a[boroLocation] = icu; // copy 10 to location of 30, a[4]
        i = 0;
        while (i < a.length) {
            System.out.print(a[i]+", ");
           ++i;
        }
    }
}
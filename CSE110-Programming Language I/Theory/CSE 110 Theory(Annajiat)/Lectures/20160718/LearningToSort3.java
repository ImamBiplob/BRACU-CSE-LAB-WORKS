import static java.lang.System.*;
public class LearningToSort3 { //Descending order
    public static void main (String[] args) {
        //          0  1    2   3   4
        int[] a = {99, 88, 66, 44, 77};
        int boroSoFar = a[2];//66
        int boroLocation = 2;
        int v=3;
        while (v < a.length) {
            if (a[v] > boroSoFar) {
                boroSoFar = a[v];//77
                boroLocation = v;//4
            }
            ++v;
        }       
        out.println("boroSoFar="+boroSoFar);
        out.println("boroSoFar was spotted at "+boroLocation);
        int icu = a[2];//backing up 66 from a[2] to icu
        a[2] = boroSoFar;//copying 77 from location 4 to a[2], in place of 66
        a[boroLocation] = icu;//copying 66 from icu to location 4, in place of 77
        v=0;
        while(v < a.length) {
            out.print(a[v]+" ");
            ++v;
        }
    }
}
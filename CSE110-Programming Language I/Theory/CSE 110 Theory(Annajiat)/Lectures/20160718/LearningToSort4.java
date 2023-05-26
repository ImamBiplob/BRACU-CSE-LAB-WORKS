import static java.lang.System.*;
public class LearningToSort4 { //Descending order
    public static void main (String[] args) {
        //          0  1    2   3   4
        int[] a = {99, 88, 77, 44, 66};
        int boroSoFar = a[3];//44
        int boroLocation = 3;
        int v=4;
        while (v < a.length) {
            if (a[v] > boroSoFar) {
                boroSoFar = a[v];//77
                boroLocation = v;//4
            }
            ++v;
        }       
        out.println("boroSoFar="+boroSoFar);
        out.println("boroSoFar was spotted at "+boroLocation);
        int icu = a[3];//backing up 44 from a[3] to icu
        a[3] = boroSoFar;//copying 66 from location 4 to a[3], in place of 44
        a[boroLocation] = icu;//copying 44 from icu to location 4, in place of 66
        v=0;
        while(v < a.length) {
            out.print(a[v]+" ");
            ++v;
        }
    }
}
import static java.lang.System.*;
public class LearningToSort1 { //Descending order
    public static void main (String[] args) {
        //          0  1    2   3   4
        int[] a = {77, 66, 88, 44, 99};
        int boroSoFar = a[0];//77
        int boroLocation = 0;
        int v=1;
        while (v < a.length) {
            if (a[v] > boroSoFar) {
                boroSoFar = a[v];//88
                boroLocation = v;//2
            }
            ++v;
        }       
        out.println("boroSoFar="+boroSoFar);
        out.println("boroSoFar was spotted at "+boroLocation);
        int icu = a[0];//backing up 77 from a[0] to icu
        a[0] = boroSoFar;//copying 99 from location 4 to a[0], in place of 77
        a[boroLocation] = icu;//copying 77 from icu to location 4, in place of 99
        v=0;
        while(v < a.length) {
            out.print(a[v]+" ");
            ++v;
        }
    }
}
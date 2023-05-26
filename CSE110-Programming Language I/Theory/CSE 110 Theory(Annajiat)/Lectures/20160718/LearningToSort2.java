import static java.lang.System.*;
public class LearningToSort2 { //Descending order
    public static void main (String[] args) {
        //          0  1    2   3   4
        int[] a = {99, 66, 88, 44, 77};
        int boroSoFar = a[1];//77
        int boroLocation = 1;
        int v=2;
        while (v < a.length) {
            if (a[v] > boroSoFar) {
                boroSoFar = a[v];//88
                boroLocation = v;//2
            }
            ++v;
        }       
        out.println("boroSoFar="+boroSoFar);
        out.println("boroSoFar was spotted at "+boroLocation);
        int icu = a[1];//backing up 66 from a[1] to icu
        a[1] = boroSoFar;//copying 88 from location 2 to a[1], in place of 66
        a[boroLocation] = icu;//copying 66 from icu to location 2, in place of 88
        v=0;
        while(v < a.length) {
            out.print(a[v]+" ");
            ++v;
        }
    }
}
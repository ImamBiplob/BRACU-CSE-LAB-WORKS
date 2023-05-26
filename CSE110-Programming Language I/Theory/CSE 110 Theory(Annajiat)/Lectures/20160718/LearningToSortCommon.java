import static java.lang.System.*;
public class LearningToSortCommon { //Descending order
    public static void main (String[] args) {
        int v;
        //          0  1    2   3   4
        int[] a = {77, 66, 88, 44, 99};
        int position=0;
        while(position < a.length-1) {
            int boroSoFar = a[position];//77
            int boroLocation = position;
            v=position+1;
            while (v < a.length) {
                if (a[v] > boroSoFar) {
                    boroSoFar = a[v];//88
                    boroLocation = v;//2
                }
                ++v;
            }       
            int icu = a[position];//backing up 77 from a[0] to icu
            a[position] = boroSoFar;//copying 99 from location 4 to a[0], in place of 77
            a[boroLocation] = icu;//copying 77 from icu to location 4, in place of 99
            ++position;
        }
        v=0;
        while(v < a.length) {
            out.print(a[v]+" ");
            ++v;
        }
    }
}
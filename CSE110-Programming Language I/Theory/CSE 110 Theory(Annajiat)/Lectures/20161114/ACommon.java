public class ACommon {
    public static void main(String[] args) {
        int c;
                 // 0  1   2   3   4
        int[] a = {14,20,16,30,70};
        for(int v=0; v < a.length-1 ; ++v) {
            int boroSoFar = a[v]; 
            int boroLocation = v;
            for(c=v+1; c < a.length; ++c) {
                if (a[c] > boroSoFar) {
                    boroSoFar = a[c];
                    boroLocation = c;
                }
            }
            int icu = a[v];
            a[v] = boroSoFar;
            a[boroLocation] = icu; 
        }
        for(c=0;c<a.length;++c) {
            System.out.print(a[c]+ " ");
        }
    }
}
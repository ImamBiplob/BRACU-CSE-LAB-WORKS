public class A1 {
    public static void main(String[] args) {
                // 0  1   2   3   4
        int[] a = {16, 20, 14, 30, 70};
        int boroSoFar = a[0]; 
        int boroLocation = 0;
        int c;
        for(c=1; c < a.length; ++c) {
            if (a[c] > boroSoFar) {
                boroSoFar = a[c];
                boroLocation = c;
            }
        }
        System.out.println(boroSoFar + " was found at "+boroLocation);
        int icu = a[0];
        a[0] = boroSoFar;
        a[boroLocation] = icu;
        for(c=0;c<a.length;++c) {
            System.out.print(a[c]+ " ");
        }
    }
}
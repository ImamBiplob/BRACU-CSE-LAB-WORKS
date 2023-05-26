public class A3 {
    public static void main(String[] args) {
                 // 0  1   2   3   4
        int[] a = {70, 30, 20, 14, 16};
        int boroSoFar = a[2]; 
        int boroLocation = 2;
        int c;
        for(c=3; c < a.length; ++c) {
            if (a[c] > boroSoFar) {
                boroSoFar = a[c];
                boroLocation = c;
            }
        }
        System.out.println(boroSoFar + " was found at "+boroLocation);
        int icu = a[2];
        a[2] = boroSoFar;
        a[boroLocation] = icu; 
        for(c=0;c<a.length;++c) {
            System.out.print(a[c]+ " ");
        }
    }
}
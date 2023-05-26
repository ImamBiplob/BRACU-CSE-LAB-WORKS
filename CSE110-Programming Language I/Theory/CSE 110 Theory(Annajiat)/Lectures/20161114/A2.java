public class A2 {
    public static void main(String[] args) {
                 // 0  1   2   3   4
        int[] a = {70, 20, 14, 30, 16};
        int boroSoFar = a[1]; 
        int boroLocation = 1;
        int c;
        for(c=2; c < a.length; ++c) {
            if (a[c] > boroSoFar) {
                boroSoFar = a[c];
                boroLocation = c;
            }
        }
        System.out.println(boroSoFar + " was found at "+boroLocation);
        int icu = a[1];
        a[1] = boroSoFar;
        a[boroLocation] = icu; 
        for(c=2;c<a.length;++c) {
            System.out.print(a[c]+ " ");
        }
    }
}
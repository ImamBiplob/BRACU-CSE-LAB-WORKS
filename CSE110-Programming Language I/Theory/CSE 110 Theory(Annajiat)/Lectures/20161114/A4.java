public class A4 {
    public static void main(String[] args) {
                 // 0  1   2   3   4
        int[] a = {70, 30, 20, 14, 16};
        int boroSoFar = a[3]; //20
        int boroLocation = 3;
        int c;
        for(c=4; c < a.length; ++c) {
            if (a[c] > boroSoFar) {
                boroSoFar = a[c];
                boroLocation = c;
            }
        }
        System.out.println(boroSoFar + " was found at "+boroLocation);
        int icu = a[3];
        a[3] = boroSoFar;
        a[boroLocation] = icu; 
        for(c=0;c<a.length;++c) {
            System.out.print(a[c]+ " ");
        }
    }
}
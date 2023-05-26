/*Sorting means to arrange elements, usually done in two ways,
Ascending: first to last, low to high,small to large,a-z,lexicographically
Descending: last to first,high to low,large to small,z-a,...etc*/
public class Step2 {//descending order
    public static void main(String[] args) {
        int count;
        //          0  1  2  3  4
        int[] a = {50,30,10,20,40}; 
        int boroSoFar = a[1];//30
        int boroLocation = 1;
        for(count=2; count<a.length; ++count) {
            if(a[count]>boroSoFar) {//a[count]=a[4]=40>boroSoFar=30
                boroSoFar = a[count];//copy 40 overwriting 30
                boroLocation = count;//note location, 4
            }
        }
        int icu = a[1];//backup 30 to icu
        a[1]=boroSoFar;//copy 40 to location 1
        a[boroLocation] = icu;//copy 30 from icu to 4, location of 40
        System.out.println("boroSoFar ="+boroSoFar );
        for(int index=0; index<a.length; ++index) {
            System.out.print(a[index]+" ");
        }
   }
}
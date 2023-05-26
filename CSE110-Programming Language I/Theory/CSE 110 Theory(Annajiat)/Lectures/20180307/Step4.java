/*Sorting means to arrange elements, usually done in two ways,
Ascending: first to last, low to high,small to large,a-z,lexicographically
Descending: last to first,high to low,large to small,z-a,...etc*/
public class Step4 {//descending order
    public static void main(String[] args) {
        int count;
        //          0  1  2  3  4
        int[] a = {50,40,30,10,20}; 
        int boroSoFar = a[3];//10
        int boroLocation = 3;
        for(count=4; count<a.length; ++count) {
            if(a[count]>boroSoFar) {//a[count]=a[4]=20>boroSoFar=10
                boroSoFar = a[count];//copy 20 overwriting 10
                boroLocation = count;//note location, 4
            }
        }
        int icu = a[3];//backup 10 to icu
        a[3]=boroSoFar;//copy 20 to location 3
        a[boroLocation] = icu;//copy 10 from icu to 4, location of 20
        System.out.println("boroSoFar ="+boroSoFar );
        for(int index=0; index<a.length; ++index) {
            System.out.print(a[index]+" ");
        }
   }
}
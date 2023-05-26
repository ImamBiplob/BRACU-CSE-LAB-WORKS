/*Sorting means to arrange elements, usually done in two ways,
Ascending: first to last, low to high,small to large,a-z,lexicographically
Descending: last to first,high to low,large to small,z-a,...etc*/
public class Step3 {//descending order
    public static void main(String[] args) {
        int count;
        //          0  1  2  3  4
        int[] a = {50,40,10,20,30}; 
        int boroSoFar = a[2];//10
        int boroLocation = 2;
        for(count=3; count<a.length; ++count) {
            if(a[count]>boroSoFar) {//a[count]=a[4]=30>boroSoFar=20
                boroSoFar = a[count];//copy 30 overwriting 20
                boroLocation = count;//note location, 4
            }
        }
        int icu = a[2];//backup 10 to icu
        a[2]=boroSoFar;//copy 30 to location 2
        a[boroLocation] = icu;//copy 10 from icu to 4, location of 30
        System.out.println("boroSoFar ="+boroSoFar );
        for(int index=0; index<a.length; ++index) {
            System.out.print(a[index]+" ");
        }
   }
}
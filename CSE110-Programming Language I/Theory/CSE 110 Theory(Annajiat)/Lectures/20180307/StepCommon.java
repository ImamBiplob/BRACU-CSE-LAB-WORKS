/*Sorting means to arrange elements, usually done in two ways,
Ascending: first to last, low to high,small to large,a-z,lexicographically
Descending: last to first,high to low,large to small,z-a,...etc*/
public class StepCommon{//descending order
    public static void main(String[] args) {
        int count;
        //          0  1  2  3  4
        int[] a = {10,30,50,20,40}; 
        for(int v=0;v<a.length-1;++v){//use <=a.length-2 or <a.length-1 instead of 3
            int boroSoFar = a[v];//10
            int boroLocation = v;
            for(count=v+1; count<a.length; ++count) {
                if(a[count]>boroSoFar) {//a[count]=a[2]=50>boroSoFar=30
                    boroSoFar = a[count];//copy 50 overwriting 30
                    boroLocation = count;//note location, 2
                }
            }
            int icu = a[v];//backup 10 to icu
            a[v]=boroSoFar;//copy 50 to location 0
            a[boroLocation] = icu;//copy 10 from icu to 2, location of 50
        }
//        System.out.println("boroSoFar ="+boroSoFar );
        for(int index=0; index<a.length; ++index) {
            System.out.print(a[index]+" ");
        }
   }
}
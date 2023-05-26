public class LearnArray {
    public static void main(String[] args) {
        //way1 of 3:
        /*int[] a = new int[3];//a = [0  0  0], individually, a[0],a[1],a[2]
        a[0]=10;
        a[1]=30;
        a[2]=20;*/
        //way 2 of 3: arrray initializer syntax
        int[] a = {10,30,20}; //single line only
        //way 3 of 3: arrray initializer syntax
        /*int[] a;
        a = new int[] {10,30,20};
        a = new int[] {13,121,43,33};*/
        //System.out.println("a.length="+a.length);
        //serialNo is called index/offset
        System.out.print("[ ");
        for(int index=0; index<a.length; ++index) {
            System.out.print(a[index]+" ");
        }
        System.out.println("]");
    }
}
/*
 > B b1 = new B(), b2=new B();
> b2.mA();
100 
601 
*/
class B {
    static int x;
    int mB(int[] a, int element) {
        a[1]=100;
        element *=5;
        a = new int[] {77,99};
        return a[1]+element+ ++x;
    }
    void mA(){
        int[] arr=new int[]{10,20};
        mB(arr,arr[1]);
        System.out.println(arr[1]);
        System.out.println(mB(arr,arr[1]));
    }
}
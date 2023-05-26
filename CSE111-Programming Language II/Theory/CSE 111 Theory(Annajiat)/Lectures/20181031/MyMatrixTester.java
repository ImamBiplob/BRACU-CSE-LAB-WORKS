//tester/driver/user class
public class MyMatrixTester {
    public static void main (String[] args) {
        int[] ektaArray = {1,2};
        MyMatrix m1 = new MyMatrix(ektaArray);
        int[] arektaArray = {500,600};
        MyMatrix m2 = new MyMatrix(arektaArray);
        MyMatrix m3 = m1.add(m1).add(m1).add(m1);
//        MyMatrix m4 = m1.multiply(4);
//        System.out.println(m1);
//        System.out.println(m2);
        System.out.println(m3);
//        System.out.println(m4);
//        System.out.println(m1);
//        System.out.println(m2);
    }
}
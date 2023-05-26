/*take 3 numbers from user, print sum and followed by those numbers 
 * in reverse order, if user give 10,30,20, print 60,20,30,10*/
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //BIPOD 1 OF 4: DECLARING 1000 VARIABLES
        //a[0],a[1],a[2],a[3]....a[999],sum;
        int[] a = new int[1000];//array
        int v=0;
        while(v<=999) {
            System.out.println("din");
            a[v] = sc.nextInt();
            ++v;
        }
        int sum=0;
        v=0;
        while(v<=999) {
            sum+=a[v];
            ++v;
        }
        System.out.println(sum);
       v=999;
        while(v>=0) {
           System.out.println(a[v]);
            --v;
        } 
    }
}
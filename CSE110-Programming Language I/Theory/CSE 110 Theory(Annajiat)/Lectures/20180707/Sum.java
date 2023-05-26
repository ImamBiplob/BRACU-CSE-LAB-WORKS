//input: 10, 30, 20
//output: 60, 10, 30, 20
import java.util.*;
class Sum {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int sum; 
        int[] a = new int [3]; 
        int v = 0;
        while (v <= 2) {
            System.out.println("Ekti number din");
            a[v] = scanner.nextInt();
            ++v;
        }
        sum = 0;
        v = 0;
        while (v <= 2) {
            sum = sum + a[v];
            ++v;
        }
        System.out.println(sum);
        v = 0;
        while (v <= 2) {
            System.out.println(a[v]);
            ++v;
        }
    }
}
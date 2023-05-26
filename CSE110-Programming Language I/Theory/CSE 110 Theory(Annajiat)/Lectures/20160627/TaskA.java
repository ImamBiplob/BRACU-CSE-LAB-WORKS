//take 3 numbers from user, print sum, then print those numbers
import static java.lang.System.*;
import java.util.*;
public class TaskA {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        int sum = 0;
        int a, b, c;
        out.println("dao");
        a = scanner.nextInt();
        out.println("dao");
        b = scanner.nextInt();
        out.println("dao");
        c = scanner.nextInt();
        sum = a + b + c;
        out.println("jogfol="+sum);
        out.println(a);
        out.println(b);
        out.println(c);
    }
}
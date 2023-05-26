import static java.lang.System.*;
import java.util.*;
public class LearnArray3 {
    public static void main (String[] args) {
        int[] a = {50,7,900};
        int[] b = {77,11,33,55};
        
        b = a;
        out.println(b[0]);
        
        a = b;
        out.println(a[0]);
     }
}
import static java.lang.System.out;
import java.util.*;
public class LalBati {
    public static void main (String[] args) {
        Scanner k = new Scanner (System.in);
        //int n = k.nextInt();
        try {
            out.println("hi");
        }catch(java.lang.ArithmeticException a){
            out.println("playing pillow passing");
        }finally {
            out.println("final breath");
        }
    }
}
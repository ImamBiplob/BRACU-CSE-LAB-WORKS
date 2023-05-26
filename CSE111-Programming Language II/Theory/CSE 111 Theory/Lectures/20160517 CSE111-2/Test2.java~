import static java.lang.System.*;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int[] a = new int[5];
//        out.println(a);
        for(int count=0;count<a.length;++count){
            int candidate = scanner.nextInt();
            //check if already exist
            boolean found = false;
            for(int checkerCount=0;checkerCount<count;++checkerCount) {
                if(a[checkerCount] == candidate) {
                    found = true;
                    break;
                }
            }
            if(!found) { //found == false
                a[count] = candidate;
            } else {
                out.println("duplicate found");
                --count;
            }
        }
        out.println();
        for(int count=0;count<a.length;++count){
            out.print(a[count]+" ");
        }
    }
}

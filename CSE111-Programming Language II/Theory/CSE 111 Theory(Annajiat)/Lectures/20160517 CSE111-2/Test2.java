import static java.lang.System.*;
public class Test2 {
    public static void main(String[] args) {
        int[] a = {30, 10, 20, 10, 30};
        int[] tempDestination = new int[a.length];
        int uniqueCount = 0;
        for(int count=0;count<a.length;++count){
            int candidate = a[count];
            boolean found = false; //check if already exist
            for(int checkerCount=0;checkerCount<uniqueCount;++checkerCount) {
                if(tempDestination[checkerCount] == candidate) {
                    found = true;
                    break;
                }
            }
            if(!found) tempDestination[uniqueCount++] = candidate;
        }
        int[] finalDestination = new int[uniqueCount];
        for(int count=0;count<finalDestination.length;++count){
            finalDestination[count] = tempDestination[count];
        }
        for(int count=0;count<finalDestination.length;++count){
            out.print(finalDestination[count]+" ");
        }
    }
}

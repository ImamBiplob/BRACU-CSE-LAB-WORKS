public class Hashi {
    public static void main (String[] args) {
        int haCount ;
        haCount = 1; //initialization
        while (haCount <= 3) { //conditition
            System.out.print("ha"+haCount+" "); //loop body/work
            ++haCount; //counter-change/increment/drecement
        }
        //    ini           cond            counter-change
        for( haCount = 1; haCount <= 3 ; ++haCount) {
            System.out.print("ha"+haCount+" "); //loop body/work
            
        }
    }
}
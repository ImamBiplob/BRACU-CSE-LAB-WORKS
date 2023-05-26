public class Hashi4 {
    public static void main (String[] args) {
        int haCount = 1; //initialization
       while (haCount <= 5) { //conditition
            System.out.print("ha"+haCount+" "); //loop body/work
            if (haCount == 4) {
               ++haCount; //haCount=5;
                continue;
            }
            System.out.print("na"+haCount+" "); //loop body/work
            System.out.println();
            ++haCount; //counter-change/increment/drecement
        }/*
        for(haCount = 1; haCount <= 5; ++haCount) {
            System.out.print("ha"+haCount+" "); //loop body/work
            if (haCount == 4) {
                continue;
            }
            System.out.print("na"+haCount+" "); //loop body/work
            System.out.println();
        }*/
        
    }
}
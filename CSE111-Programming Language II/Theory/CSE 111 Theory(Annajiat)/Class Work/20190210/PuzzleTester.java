public class PuzzleTester {
    public static void main(String[] args) { 
        Puzzle p = new Puzzle();
        Puzzle p2 = new Puzzle(2);
        Puzzle p3 = new Puzzle(1,3);
        p.z=p2.x+p3.methodA(p.x);
        System.out.println(p.x+" "+p.z);
        p3.z=p2.methodA(p.z+2)+p.x;
        System.out.println(p2.x+" "+p2.z);
        p.methodA(p3.x,p3.z);
        System.out.println(p.x+" "+p.z);
    }
}

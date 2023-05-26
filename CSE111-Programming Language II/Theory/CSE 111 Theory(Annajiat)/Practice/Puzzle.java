class Puzzle{
    public int x = 3,z = 4;
    public Puzzle() {
        x = -1;
        z = -2;
    }
    public Puzzle(int x) {
        this.x = x;
    }
    public Puzzle(int x, int z) {
        this.x = x;
        this.z = z;        
    }
    public void methodA(){
        x = 5; 
    }
    public int methodA(int y){
        x = y + x;
        System.out.println(x + " " + y);
        return x + 3;
    }
    public void methodA(int z, int x){
        z = z + 1;
        x = x + 1;
        System.out.println(z + " " + x);
    }
}
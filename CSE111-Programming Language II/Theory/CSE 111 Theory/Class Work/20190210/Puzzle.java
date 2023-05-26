class Puzzle{
    int x=3,z=4;
    Puzzle() {
        x=-1;
        z=-2;
    }
    Puzzle(int x) {
        this.x = x;
    }
    Puzzle(int x, int z) {
        this.x = x;
        this.z = z;        
    }
    void methodA(){
        x=5; 
   }
    int methodA(int y){
        x=y+x;
        System.out.println(x+" "+y);
        return x+3;
    }
    void methodA(int z, int x){
        z=z+1;
        x=x+1;
        System.out.println(z+" "+x);
    }
}
public class Vehicle {
    private int x, y;
    
    public void moveUp() {
        y ++;
    }
    
    public void moveDown() {
        y --;
    }
    
    public void moveLeft() {
        x --;
    }
    
    public void moveRight() {
        x ++;
    }
    
   
    
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
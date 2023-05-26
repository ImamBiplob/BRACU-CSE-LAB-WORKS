public class Cat{
    public String color = "White";
    public String action = "sitt";
//your code here
    Cat(){
    }
    Cat(String color) {
        changeColor(color);
    }
    Cat(String color,String action) {
//        changeColor(color);
        this(color);
        this.action = action;
    }
    void changeColor(String color) {
        this.color = color;
    }
    void printCat(){
        System.out.println(color+" cat is "+action+"ing.");
    }
}

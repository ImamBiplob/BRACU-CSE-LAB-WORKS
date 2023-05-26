public class Dog {
    private String color = "Black";
    //your code here
    Dog(String color) {
        changeColor(color);
    }
    void bark(){
        System.out.println(color+" dog is barking");
    }
    void changeColor(String color) {
        this.color = color;
    }
}
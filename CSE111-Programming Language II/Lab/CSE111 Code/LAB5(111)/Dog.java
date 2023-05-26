public class Dog {
  private String color="Black";
  Dog(String color) {
    this.color=color;
  }
  public void changeColor(String color){
    this.color=color;
  }
  public void bark(){
    System.out.println(color+" dog is barking");
  }
}
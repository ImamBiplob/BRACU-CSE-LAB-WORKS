public Dog() {
}
public Dog (String color) {
    setColor(color);
}
public void setColor(String color) {
    this.color = color;
}
public void setAction(String action) {
    this.action = action;
}
public void printDog() {
    System.out.println(color+" dog is "+action);
}
public Dog amarAddress(){
    return this;
}
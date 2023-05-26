//(class) design/blueprint
public class MyRobot {
    //instance variables
    String name = "Unnamed Robot";
    private int model = 2018;
    int batteryLevel = 100;
    MyRobot(){//default constructor/ctor
    }
    MyRobot(String naam, int jonmo) throws Exception {
        name = naam;
        setModel(jonmo);
    }
    //getter/setter methods
    //accessor/mutators
    public int getModel() {
        return model;
    }
    public void setModel(int model) throws Exception {
        if(model > 0) {
            this.model = model;
        } else {
            //System.out.println("error:"+model);
            throw new NegativeNotAllowed("please be positive, not "+model);
        }
    }
    public String toString() {
        return name + "\n" + model;
    }
    int jogKoro(int a, int b) {
        return a+b;
    }
}
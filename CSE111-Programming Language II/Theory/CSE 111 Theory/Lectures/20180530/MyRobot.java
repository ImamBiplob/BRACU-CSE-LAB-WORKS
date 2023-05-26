//class design / blueprint
class MyRobot {
    private String name;
    private int model;
    
    //accessor/getter-setter
    void setModel(int model){
        if(model>1900) {
            this.model = model;
        }
    }
    int getModel() {
        return model;
    }
    /*public String toString() {
        String etaPrintKorbo=
            "name="+name+"\n"+
            "model="+model;
        return etaPrintKorbo;
    }*/
}
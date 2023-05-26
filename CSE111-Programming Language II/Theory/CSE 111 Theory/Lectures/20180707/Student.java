class Student {
    //static/class variable
    static int kotogulo;
    
    //instance variable/fields/properties
    int id;
    double mark;
    String name, address;
    
    Student() {
        ++kotogulo;
    }
    
    Student (int id, String name, double mark) {
        ++kotogulo;
        this.id = id;
        this.name = name;
        this.mark = mark;
    }
    
    //instance method/function/subroutine/action/behavior
    public String toString() {
        return "ID: "+id+"\n"+
            "Name: "+name+"\n"+
            "Mark: "+mark;
    }
}
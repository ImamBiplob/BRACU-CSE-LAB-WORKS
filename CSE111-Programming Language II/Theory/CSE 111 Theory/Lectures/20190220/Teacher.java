class Teacher {
    Course[] courses;
    String name, department;
    Teacher(String name, String department) {
        this.name = name;
        this.department = department;
    }
    void addCourse(Course c) {
        if(courses == null) {
            courses = new Course[1];
        } else {
            Course[] temp = new Course[courses.length + 1];
            for(int i=0 ; i<courses.length ; ++i) {
                temp[i] = courses[i];
            }
            courses = temp; 
        }
        courses[courses.length-1] = c;
    }
    void printDetail(){
        String detail = "========================\n"+
            "Name: " + name + "\n" + 
            "Department: " + department + "\n" + 
            "List of courses\n"+
            "========================\n";
        for(int i = 0 ; i<courses.length ; ++i) {
            detail += courses[i] + "\n";
        }
        detail += "========================";
       System.out.println(detail); 
    }
}
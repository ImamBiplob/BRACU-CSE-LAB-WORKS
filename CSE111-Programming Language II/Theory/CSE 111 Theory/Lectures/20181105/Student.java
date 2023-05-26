class Student {
    static int studentCount;
    Student() {
        ++studentCount;
    }
    void howMany(){
        System.out.println(studentCount);
    }
}
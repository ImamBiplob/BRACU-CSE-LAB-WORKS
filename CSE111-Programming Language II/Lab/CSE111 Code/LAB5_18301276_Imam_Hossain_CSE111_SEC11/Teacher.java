public class Teacher {
  String name,department;
  int c=0;
  Course a[]= new Course[3];
  Teacher(String name,String department) {
    this.name=name;
    this.department=department;
  }
  void addCourse(Course p){
  a[c]=p;
  c++;
  }
  void printDetail(){
    System.out.println("Name : "+name);
    System.out.println("Department : "+department);
    System.out.println("List of Courses : ");
    for(int i=0;i<c;i++){
      System.out.println(a[i]);
    }
    System.out.println("======================");
  }

}
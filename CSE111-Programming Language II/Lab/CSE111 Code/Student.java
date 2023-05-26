public class Student {
  private int applicantid,studentid;
  private String name;
  Student(int applicantid,int studentid,String name){
    this.applicantid=applicantid;
    this.studentid=studentid;
    this.name=name;
  }
  public boolean check(Student s){
    if(applicantid==s.applicantid&&name==s.name)
      return true;
    else
      return false;
  }
  public void identify() {
    System.out.println("ApplicantID : "+ applicantid+" StudentID : "+studentid+" Name : "+name);
  }
  public void match(Student s) {
    if(name==s.name)
      System.out.println(studentid+" is the same person as "+s.studentid);
    else
      System.out.println(studentid+" is the different person from "+s.studentid);
  }
  public void setName(String name) {
    this.name=name;
  }
}
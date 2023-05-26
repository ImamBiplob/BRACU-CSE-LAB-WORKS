public class WrongCourseException extends Exception {
  WrongCourseException(String m){
  //  super(m);
  }
  public String toString(){
    return "This course is not CSE 111";
  }
}
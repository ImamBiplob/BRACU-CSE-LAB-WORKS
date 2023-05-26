public class TestCourse{
  public static void courseNumber(int num) throws WrongCourseException{
    if (num != 111){
      throw new WrongCourseException("This course is not CSE 111");
    }
  }
  public static void main(String[] args){
    try{
      courseNumber(110);
    }catch(WrongCourseException e){
      System.out.println("ERROR: "+e);
    }
  }
}

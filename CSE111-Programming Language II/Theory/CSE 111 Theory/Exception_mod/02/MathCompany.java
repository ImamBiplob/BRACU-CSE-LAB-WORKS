public class MathCompany{
  public void doMath(int x) throws MyException{
    System.out.println("Before bad code");
    int [] a = {1};
    Student s = null;
    try{   
      s.x = 3434;
      a[200] = 200;
      int y = 10 / x;
      MyException e = new MyException("I hate CSE111");
      throw e;
    }catch(ArithmeticException e){
      System.out.println("doMath: I have caught the ArithmeticException");
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("doMath: I have caught the ArrayIndexOutOfBoundsException");      
      throw e;
    }catch(Exception e){
      System.out.println("doMath: I have caught I have no clue");      
      throw e;
    } finally{
      System.out.println("VVV Imp code");
    }
    System.out.println("After bad code");    
  }
}
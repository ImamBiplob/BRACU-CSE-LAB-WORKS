public class GraphCompany{
  public void makeGraph(int point){
    MathCompany mc = new MathCompany();
    System.out.println("Before Calling doMath");    
    mc.doMath(point);
    System.out.println("After Calling doMath");
  }
}
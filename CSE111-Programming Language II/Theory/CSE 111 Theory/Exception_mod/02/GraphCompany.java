public class GraphCompany{
  public void makeGraph(int point){
    MathCompany mc = new MathCompany();
    System.out.println("Before Calling doMath");
    try{
      mc.doMath(point);
    }catch(Exception m){
      System.out.println(m);
    }
    System.out.println("After Calling doMath");
  }
}
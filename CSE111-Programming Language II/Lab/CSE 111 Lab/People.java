public abstract class People implements IGetResearch{
  private String name="";
  public People(String name){
    this.name=name;
  }
  public final void printName(){
    System.out.println(name);
  }
  public abstract void printDesignation();
}
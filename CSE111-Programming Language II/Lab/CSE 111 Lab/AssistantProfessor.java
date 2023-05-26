public class AssistantProfessor extends People{
  private String designation,research;
  public AssistantProfessor(String name,String research){
    super(name);
    setDesignation("Assistant Professor");
    setResearch(research);
  }
  public void setDesignation(String designation){
    this.designation=designation;
  }
  public void setResearch(String research){
    this.research=research;
  }
  public void printDesignation(){
    System.out.println(designation);
  }
  public void printResearch(){
    System.out.println(research);
}
}

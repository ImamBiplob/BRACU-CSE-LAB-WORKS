public class CSE111Student extends Student {
    String name;
    CSE111Student(String name) {
        this.name = name;
    }
    public void learn(){
        System.out.println(name+"*is*"+getLearningMode());
    }
}
public abstract class Student  implements Learning  {
    private String learningMode= "";
    public final void setLearningMode(String learningMode) {
        this.learningMode= learningMode;
    }
    public final String getLearningMode () {
        return learningMode;
    }
}

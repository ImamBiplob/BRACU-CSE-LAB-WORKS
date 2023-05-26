public class UnivrsityLife {
    public static void learn(Learning learner) {
        learner.learn();
    }
    public static void main(String[] args) {
        CSE111Student s1 = new CSE111Student("StudentA");
        s1.setLearningMode ("lookingAtSolutions");
        learn(s1);
        CSE111Student s2 = new CSE111Student("Student B");
        s2.setLearningMode ("writingCode");
        learn(s2);
    }
}
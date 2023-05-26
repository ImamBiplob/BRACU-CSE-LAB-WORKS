public class StudentTester {
    public static void main(String[] args) { 
        Student s1 = new Student(),
            s2 = new Student();
        s1.id = 1;
        s1.name = "ekjon";
        s1.mark = 100;
        System.out.println("total student="+Student.kotogulo);
        /*System.out.println("s1.id="+s1.id);
        System.out.println("s1.name="+s1.name);
        System.out.println("s1.mark="+s1.mark);*/
        System.out.println(s1);//print(something) works like print (something.ToString())
        s2.id = 2;
        s2.name = "arekjon";
        s2.mark = 50;
        /*System.out.println("s2.id="+s2.id);
        System.out.println("s2.name="+s2.name);
        System.out.println("s2.mark="+s2.mark);*/
        System.out.println(s2);
        System.out.println(new Student(3,"onno",25));
        System.out.println("total student="+Student.kotogulo);
        
        BScStudent b1 = new BScStudent();
        System.out.println(b1);
    }
    
}

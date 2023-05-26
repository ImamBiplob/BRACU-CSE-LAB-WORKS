Teaching a = new ST();
a.teach();
//a.learn();
Learning e = new ST();
e.teach();
Teacher b = new Teacher();
b.teach();
Student c = new Student();
c.learn();
interface Teaching {
    void teach();
}
interface Learning {
    void learn();
}
class ST implements Learning, Teaching {
    void teach(){
    }
    void learn(){
    }
}
class Teacher implements Teaching {
       void teach(){
    }
}
class Student implements Learning {
    void learn(){
    }
}
// Create class Person with method info(). Extend it with Student and Teacher. Override info() in both and demonstrate runtime polymorphism.
class Person{
    public void info(){
        System.out.println("This is the information of the person!");
    }
}
class Student extends Person{
@Override
public void info() {
    System.out.println("This is the information of a Student");
}
}
class Teacher extends Person{
    @Override
    public void info() {
        System.out.println("This is the info of a Teacher");
    }
}

public class Demo3{
    public static void main(String[] args) {
        System.out.println("Here!");
        Person s=new Student();
        Person t=new Teacher();
        s.info();
        t.info();
    }
}
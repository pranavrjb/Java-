//Create a class Student with fields name and marks. Overload method display() to show name only and name with marks.

class Student{
    String name;
    int marks;

    public void display(String name){
        this.name=name;
        System.out.println("The name of the Student is: " + name);
    }
    public void display(String name,int marks){
        this.name=name;
        this.marks=marks;
        System.out.println("The name of the Student " + name +" and the mark of the student is :"+marks);
    }
}
public class Demo2 {
public static void main(String[] args) {
    System.out.println("PewPewPewPew");
    Student s=new Student();
    Student s1=new Student();
    s.display("Hrishita");
    s1.display("Pranav", 89);
}
}
class Student{
    String name;
    Student (String n){
    name = n;
    }
    void display(){
        System.out.println("Name: "+name);
    }
}
public class Constructor {
    public static void main(String[] args) {
    //A Constructor is a special method that runs automatically when an obj is created.
        Student s=new Student("Hrishita");
        s.display();
    }
}
//Constructor = class name
//No return type
//It is used to initialize obj.
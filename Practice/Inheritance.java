//Inheritance means accquring the properties and behaviors of one class to the another class. It allows code reusability and medhod overriding.

class Parent{
    void show(){
        System.out.println("This is a parent class.");
    }
}
class Child extends Parent{
void display(){
    System.out.println("This is child class.");
}
}
public class Inheritance{
    public static void main(String[] args) {
        Child c=new Child();
        c.show();
        c.display();
    }
}
//Types of Inheritance in java
// 1. Single -> One class inherits another
// 2. Multilevel -> A class derived from another derived class.
// 3. Hierarchical ->One parent with multiple child classes.

//What is superclass and subclass?
//Superclass is a class that inherited it methods and field to another classes.
//Sub class is a class the inherits the method and field from the parent class.

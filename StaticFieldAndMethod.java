class Employee{

    static String office="Logpoint";
    String name;

    Employee(String n){
        name=n;
    }
    void displayInfo(){
        System.out.println(name + " Works at " + office);
    }
    //static method
    public static void display(String name){
        System.out.println(name + " works at "+ office);
    }
}
public class StaticFieldAndMethod {
    public static void main(String[] args) {
        //static means common for all the obj as well as it is independent. We can access static members without creating an obj.
    Employee.display("Hrishita");
    Employee.display("Pranav");
    }
}

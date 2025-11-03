class Employee{
    String name;
    int id;

Employee(String name, int id){
    this.name=name; //it refers to the instance variables
    this.id=id; // id "right side" is the params
}
void displayInfo(){
    System.out.println("Name: " + this.name);
    System.out.println("Id: "+ this.id);
}
}
//this refers tp the current obj of the class. It helps to diffrentiate between the instance variables and params that have the same name.
public class This{

public static void main(String[]args){
Employee e1= new Employee("Hrishita", 102);
e1.displayInfo();
}
}

class Student{
    //variables(Attributes): It describes an object's data. for ex: model, color, name.
    //Methods (Function):It describe the behavior. for ex: stop(), start(), display()
    String name;
    int age;
    String address;

    void displayInfo(){
        System.out.println(name + " is "+ age + "year old! "+ "Address is " + address);
    }
}
public class VarAndMethods{
    public static void main(String[] args) {
        Student sc=new Student();
        sc.name="Hrishita";
        sc.address="Biratnagar";
        sc.age=17;
        sc.displayInfo();
    }
}

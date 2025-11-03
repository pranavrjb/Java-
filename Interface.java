//An interface is a fully abstract class that contains only abstract mehthods and constants.

interface Vehicle{
    void start(); //it is automatically abstract & public
}
class Car implements Vehicle{
    public void start(){
        System.out.println("Car starts with key!");
    }
}
public class Interface {
public static void main(String[] args) {
    Car c=new Car();
    c.start();
}
}
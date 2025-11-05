//Create an abstract class Vehicle with abstract method start(). Derive Car and Bike classes and implement start(). Instantiate both.
abstract class Vehicle{
    public abstract void start();
}

class Car extends Vehicle{
    private String engineType= "Disel";

    @Override
    public void start() {
    System.out.println("Car engine is starting.");
    System.out.println("Engine Type "+ engineType);
    }
}
class Bike extends Vehicle{
    private String engineType="Pertol";
    @Override
    public void start(){
        System.out.println("Bike is starting!!!");
        System.out.println("Engine Type: "+engineType);
    }
}
public class Abstract {
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        Bike b=new Bike();
        b.start();
    }
}

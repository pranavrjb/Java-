//Create an interface Flyable with method fly(). Create classes Bird and Airplane implementing Flyable. Call fly() method for each.
interface Flyable {
public void fly();
}
class Bird implements Flyable{
    private String name= "Sparrow";
    @Override
    public void fly() {
        System.out.println(name +" fly in the sky");
    }
}
class Airplane implements Flyable{
    private String name="Buddha Air";
    @Override
    public void fly() {
        System.out.println(name + " is the biggest Domestic Airline in Nepal.");
    }
}
public class Test {
public static void main(String[] args) {
    Flyable b=new Bird();
    b.fly();
    Flyable a=new Airplane();
    a.fly();

}
}
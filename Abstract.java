abstract class  Animal {
abstract void sound(); 
void sleep(){
    System.out.println("Animal can sleep.");
}
}
class Dog extends Animal{
    //implementing abstract method
    void sound(){
        System.out.println("Dogs barks.");
    }
}
public class Abstract {
    //it is a class that cannot be instantiated, we cannot create its obj directly.
    public static void main(String[] args) {
        Dog d= new Dog(); //created obj of subclass
        d.sound(); //call overridden method
        d.sleep(); //calls normal method
    }
}

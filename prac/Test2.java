// Create an interface Animal with method sound(). Create Dog and Cat classes. Call sound() for both using a parent reference (dynamic dispatch).
interface Animal {
public void sound();
}
class Dog implements Animal{
@Override
public void sound() {
    System.out.println("bhaw bhaw");
    
}
}
class Cat implements Animal{
    @Override
    public void sound() {
        System.out.println("Meow moew");
        
    }
}
public class Test2{
    public static void main(String[] args) {
        Animal d=new Dog();
        Animal c=new Cat();
        d.sound();
        c.sound();
    }
}
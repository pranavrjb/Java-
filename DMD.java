class Animal {
    void sound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}
//dynamic method dispatch is a process in Java where the method to be executed is decided at runtime, not at compile time.
public class DMD {
    public static void main(String[] args) {
    Animal a= new Dog();
    a.sound();
}
}
//Super keyword can be define as the immediate parent class.
class Animal{
    void sound(){
        System.out.println("Animal sound!");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        super.sound(); 
        System.out.println("Cat Meow Meow.");
    }
}

public class Super {
    public static void main(String[] args) {
        Cat c= new Cat();
        c.sound();
    }
}

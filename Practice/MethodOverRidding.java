class Animal{
    void sound(){
        System.out.println("Animal makes a sound!");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog Barks!");
    }
}

public class MethodOverRidding {
//When a subclass provides a new version of a method that already exists in the parent class with same name, same parameters, and same return types is known as method overridng.
//Overriding = replacing a prarent's method in the child class.
public static void main(String[] args) {
    Animal a=new Dog();
    a.sound();
}
}
// Override                            overloading
// Same method name, same params,      Same method name but different params within the same class.
// in parent and child class.

// It occurs betn parent and child     It occurs within the same class.
// class.

// Params must be same.                Params must be diff.

// @Override keywords is usually       No special keywords.
// used.
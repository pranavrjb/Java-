//classes and objects
//class can be define as a template or a blueprint to create an object.
class Car{
    String color;
    void start(){
        System.out.println("Car started!");
    }
}
public class Main {
    public static void main(String[] args) {
  //Object can be define as the instances of a class. We create an object using new keyword. 
    Car oj=new Car();
    oj.start();
    }
}

 //encaplsulation -> it hide the data for safety purpose. for ex: ATM hides the PIN code inside.
    //inheritance -> It is use for reusing the existing codes. For ex:"Car" class inherits from the vehicle.
    //polymorphism -> It can be defines as one thing but in many forms. Ex: Phone is use for calling, texting, watching video and many more.
    //abstraction -> It shows only essentials detials. Ex: We drive a car without knowing its engine code.
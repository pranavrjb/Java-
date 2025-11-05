// Create a class Person with field age. Throw a custom exception if age < 0.
class InvalidAgeException extends Exception{
public InvalidAgeException(String message){
    super(message);
}
}
class Person{
    private int age;

public Person(int age) throws InvalidAgeException{
    if (age<0) {
        throw new InvalidAgeException("Age is -ve. You provided "+age);
    }
    this.age=age;
    System.out.println("Person created successfully with age. "+this.age);
}
public int getArea(){
    return age;
}
}
public class Test1{
    public static void main(String[] args) {
        System.out.println("duiduiduii");
        try {
          Person p2=new Person(-21);  
        } catch (InvalidAgeException e) {
            System.out.println("Caught Error: "+e.getMessage());
        }
    }
}
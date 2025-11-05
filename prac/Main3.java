//Create a generic class Box<T> to store an item of any type and display it.
// class Box<T>{
//     private T item;
//     public Box(T item){
//         this.item=item;
//     }
//     public T getItem(){
//         return item;
//     }
//     public void showItem(){
//         System.out.println("Stored Item: "+item);
//     }
// }
// public class Main3 {
// public static void main(String[] args) {
//     Box<Integer> intBox=new Box<>(55);
//     Box<String> strBox=new Box<>("Hrishita");
//     intBox.showItem();
//     strBox.showItem();
// }
// }

//Create a bounded generic class Calculator<T extends Number> to add two numbers.
class Calculator<T extends Number>{
    private T num1;
    private T num2;
    public Calculator(T num1, T num2){
        this.num1=num1;
        this.num2=num2;
    }
    public int add(){
        return num1.intValue() + num2.intValue();
    }
    public void show(){
        System.out.println("The sum of two number is: "+add());
    }
}
public class Main3{
    public static void main(String[] args) {
            Calculator<Integer> intCalc=new Calculator<>(66,55);
            intCalc.show();
        }
    }

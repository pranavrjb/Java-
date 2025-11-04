//Generic programming means writing code that work with different data types without rewriting it.
//It provides:
//1. Reusability - Write once use for any type
//2. Type safety- Catches error at compile time.
//3. Eliminates casting - No need to convert manually.

//generic class with type params <T>
//Generic class can be define as a class with a type parameters that can accept any data types.
// class Box<T>{
// private T value;

// void setValue(T value){
//     this.value= value;
// }
// T getValue(){
//     return value;
// }
// }

// public class Generics {

//     public static void main(String[] args) {
//         Box<Integer>intB = new Box<>();
//         intB.setValue(100);
//         System.out.println("Interger value: "+intB.getValue());

//         Box<String> strBox=new Box<>();
//         strBox.setValue("THis is generic");
//         System.out.println("String value: "+ strBox.getValue());

//         Box<Double> doubleBox=new Box<>();
//         doubleBox.setValue(1999.6789);
//         System.out.println("Double value: "+ doubleBox.getValue());
//     }
// }

//Generic Method is a method that can work with diff data types using type parameters, it allows us to write a single method that can handle various types of data without rewriting the code.
//Syntax:
// public static <T> void printData(T data){
//     System.out.println(data);
// }


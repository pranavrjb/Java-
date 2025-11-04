class Calculator<T extends Number>{
    private T num1,num2;
    Calculator(T a,T b){
        num1=a;
        num2=b;
    }
    double add(){
        return num1.doubleValue() + num2.doubleValue();
    }
}
public class Generic {
    public static void main(String[] args) {
        Calculator<Integer> c=new Calculator<>(4,8);
        System.out.println(c.add());
    }
}

//JVM executes generic code as normal classes, using a process called type erasure. Here, Type Information (<T>) is removed during the runtime, and the JVM works with plain objs.
// This ensure backward compatibility with older java versions.

// Limitation of Generics
//No primitive data type -> We cant use int string char, etc. instead we use Integer, String.
//No static generic types -> static member cannot use the class type params.
//No generic array creation -> T[] arr=new T[5]; is not allowed.
//Cannot use instanceof with type of params -> if (obj instanceof T) is invalid.\

//Wildcard allows flexibility when we dont know the exact types. It is represented by '?'.
//Types of WildCard
// ? -> anytype
// ? extends T -> subclasses of T
// ? super T -> superclasses of T

//Reflection and Generics
// Reflection in java allowd inspecting classes and objs at runtime like checking methods name, field, or generic type info.
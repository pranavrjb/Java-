public class Operators{
    public static void main(String[] args) {
    //Operators perform actions on variable and values.
    //1. Arithmetic Operators
    //+,-,*,/,%
    int a=12, b=5;
    System.out.println(a +b); //16
    System.out.println(a%b); //2

     //2. Bitwise Operators
    // | , &, ^,~,<<,>>
    int x=5;
    int y=3;
    System.out.println(x | y); 
    System.out.println(x ^ y);

    //3. Assignment Operators
    // =, +=, -=,*=,%=
    int z=7;
    z +=4; 
    System.out.println(z);
    z-=2;
    System.out.println(z);
    z*=2;
    System.out.println(z);

    //4. Logical Operators.
    //&&, ||, !
    int l=16;
    System.out.println(l > 18 && l<10);

    //5. Ternary Operators
    //condition ? ture : false
    int age=18;
    String res = (age >=18)?"adult":"minor";
    System.out.println(res);
}
}

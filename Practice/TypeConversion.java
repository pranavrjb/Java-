public class TypeConversion {
    public static void main(String[] args) {
        //implicit Conversion is type of conversion wehre, java automatically converts smaller types to larger types.
        int x = 15;
        double y=x; //converting int to double. int -> double
        System.out.println(y);
        //explicit casting is type of casting where, we forcefully or manual convert one type of data to another.
        double a=11.22;
        int b=(int) a; 
        System.out.println(b);
    }
}

//Ex: It's like converting liters to mililiters automatically or cutting decimals manually.

//Precedence and Associativity
// It determines the order in which operations are evaluated in an expression.
//Precedence can be define the priority of operators, with  higher precedence operators being evaluated before those with lower precedence.

//When multiple operators in an expression have the same precedence, associativity determines the order of evaluation (mostly left to right).


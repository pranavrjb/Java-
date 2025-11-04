//Exception is an error or abnormal condition that occur while a program is running.
public class Exception {

    public static void main(String[] args) {
        int a =10, b=0;
        System.out.println(a / b);
    }
}

//what is the purpose of Exception handling?
// To prevent program termination and gracefully handle issues or errors.

//There are 2 types of Exception!
// 1. Checked Exception -> Checked by compiler, must be handled. Ex IOException, SQLException.
// 2. Unchecked Exception -> Occurs at runtime, not checked by compiler. Ex: NullPointerException, ArithemeticException

//There's also Error, which is not handled like OutOfMemoryError.

//Uncaught Exceptions -> if an exception is not handled, Java automatically: Terminates the program, Prints an error message and stack trace.

//Build in Java's Exception.
// 1. ArithemeticException -> divide by zero
// 2. ArrayIndexOutOfBoundsException -> Invaild array index
// 3. NullPointerException -> using null object reference
// 4. IOException ->Input/Output errors
// 5. NumberFormatException -> Invaild type conversion
// 6. ClassNotFoundException -> class not found
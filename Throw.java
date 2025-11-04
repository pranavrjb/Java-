public class Throw {
    public static void main(String[] args) {
        int age=10;
        if (age <19) throw new ArithmeticException("not eligible for voting!"); 
    }
}

//throw is used to manaully show an exception.

//Throws is used in method declaration to inddicate that a method may throw an exception and should be handled by caller.

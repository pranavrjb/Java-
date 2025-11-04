public class Demo {
    static void checkAge(int age) throws ArithmeticException{
        if (age<18) {
            throw new ArithmeticException("Not eligible for voting.");
        }else{
            System.out.println("You are eligible for voting");
        }
    }
    public static void main(String[] args) {
        try {
            checkAge(17);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: "+ e.getMessage());
        }
        System.out.println("Program continues normally...");
    }
}


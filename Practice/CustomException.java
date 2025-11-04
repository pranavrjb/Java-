class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message); // pass message to parent Exception class
    }
}

public class CustomException {

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You must be 18 to be eligible for drinking!");
        } else {
            System.out.println("Enjoy Drinking!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(17);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

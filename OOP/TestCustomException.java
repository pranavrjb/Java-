// Step 1: Create your own exception class
class InvalidAgeException extends Exception {
    // constructor
    InvalidAgeException(String message) {
        super(message); // pass message to Exception class constructor
    }
}

// Step 2: Use the custom exception in another class
public class TestCustomException {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            // Step 3: throw the custom exception
            throw new InvalidAgeException("You must be at least 18 years old!");
        } else {
            System.out.println("Access granted.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);  // This will throw the custom exception
        } catch (InvalidAgeException e) {
            // Step 4: handle it using catch block
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

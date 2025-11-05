// Write a program that reads integers from the user and handles InputMismatchException.
import java.util.Scanner; 
import java.util.InputMismatchException;

public class Test3 {
 public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
boolean inputValid=false;
int n=0;
do {
    System.out.println("Enter the Number: ");
    try {
        n=sc.nextInt();
        inputValid=true;
    } catch (InputMismatchException e) {
        System.out.println("Error: Invalid Input format. Please enter only integer.");
        sc.next();
    
} 
}while (!inputValid);
sc.close();
System.out.println("You entered the valid number: "+ n);
}
}
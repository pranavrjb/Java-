import java.util.Scanner;
public class Scannner { 
    public static void main(String[] args) {
    System.out.println("Taking input from the user: ");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name= sc.nextLine();
    System.out.print("Enter ur age: ");
    int age= sc.nextInt();
    System.out.print("Hello, "+ name);
    System.out.println("Your age is: "+age);
    }
}
/*This is multi-line comment */
/**This is documentation comment. **/

// what's the difference between System.out.print and System.out.println?
//prints display in same line whereas println display on new line. 

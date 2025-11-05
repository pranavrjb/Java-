//Write a program to calculate factorial of a number using for loop.
import java.util.Scanner;
public class Factorial {
    // public static int factorial(int x){
    // if (x == 1) {
    //     return 1;
    // } else {
    //     return x *factorial(x-1);
    // }
    // }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Factorial Calculator: ");
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        if(n<0) {System.out.println("Error: It is a neg number!");
        return;
    }
        int factresult=1;
       for (int i=1; i <=n;i++){
        factresult *=i;
        }
        System.out.println(factresult);
    // System.out.println(factorial(5));
       }
    }


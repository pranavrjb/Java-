// Write a program to check whether a number is even or odd.
import java.util.Scanner;
public class EvenOrOdd {
public static void main(String[] args) {
    System.out.println("Enter the number: ");
    Scanner sc=new Scanner(System.in);
    int x= sc.nextInt();
    sc.close();
    System.out.println(x);
  if (x % 2==0) {
    System.out.println("Number is even");
  } else {
    System.out.println("Number is odd.");
  }
}

}

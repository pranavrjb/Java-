import java.util.Scanner;
//Write a program to find whether a number is prime or not.  
public class PrimeNumber {

public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n=s.nextInt();
    s.close();
    //assume the num is prime initially
    boolean isPrime=true;
    if (n<=1) {
        isPrime=false;
    }else if(n > 2 && n % 2 ==0){
        isPrime=false;
    }
    if(isPrime){
        for(int i = 3;i * i<=n; i +=2){
            if (n % i == 0){
                isPrime=false;
                break;
            }
        }
    }
  if (isPrime) {
    System.out.println(n + " is a prime number");
  }else{
    System.out.println(n + " is NOT a prime number.");
  }
}
}

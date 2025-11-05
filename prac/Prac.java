//wap to take a string from the user and if the length of that string is a prime number, write this string into file named "Primed.txt" otherwise into file famed "Composite/txt"

import java.util.*;
import java.io.*;
public class Prac{
    public static boolean isPrime(int n){
        if(n<=1) return false;
        if(n>2 && n%2==0) return false;
        for(int i =3;i * i<=n; i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a text: ");
        String input = sc.nextLine();
        sc.close();

        int length=input.length();
        String fileName;
        if(isPrime(length)){
            fileName="Primed.txt";
        }else{
            fileName="Composite.txt";
        }
        try {
            FileWriter fw=new FileWriter(fileName);
            fw.write(input);
            fw.close();
            System.out.println("String wrtiien in file: "+fileName);
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
        sc.close();
    }
}
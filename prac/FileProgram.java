//Write a program to read text from a file and count the number of lines.
import java.io.*;
import java.util.Scanner;

public class FileProgram {

public static void main(String[] args) {
    String fileName="question.txt";
    int lineCount=0;
    try {
        File f=new File(fileName);
        Scanner sc=new Scanner(f);
        System.out.println("Reading from file: "+fileName);
        while (sc.hasNextLine()) {
        sc.nextLine();
        lineCount ++;            
        }
        sc.close();
        System.out.println("Total number of lines: " +lineCount);
    } catch (FileNotFoundException e) {
        System.out.println("Error: "+e.getMessage());
    }
}
}
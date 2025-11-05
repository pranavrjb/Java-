//Write a program to search and display records in a file where the title starts with “C”.
import java.io.*;
public class Prac2 {

    public static void main(String[] args) {
        String fileName="demo.txt";
        try {
            FileWriter fw=new FileWriter(fileName);
            fw.write("Computer Science");
            fw.close();
            System.out.println("File written Successfully");
        } catch (IOException e) {
            System.out.println("Caught error: "+e.getMessage());
        }
        try {
            BufferedReader br= new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("Courses whose title statrt with 'C': ");

            while((line = br.readLine())!=null){

                if (line.startsWith("C") || line.startsWith("c")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
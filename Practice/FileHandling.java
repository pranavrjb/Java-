import java.io.*;
public class FileHandling {
    public static void main(String[] args) {
        String fileName= "text.txt";
        //writing to a file.
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write("This is demo file.");
            fw.close();
            System.out.println("File written successfully.");
        } catch (IOException e) {
        System.out.println("Error: "+ e.getMessage());
        }
        //Reading from a file.
        try {
         FileReader fr=new FileReader(fileName);
         fr.read(); 
         fr.close();
        } catch (IOException e) {
            System.out.println("An error occured while reading: "+ e.getMessage());
        }
    try {
        FileWriter fw=new FileWriter(fileName,true);
        fw.write("\nThis is new line!");
        fw.close();
    } catch (IOException e) {
       System.out.println(e.getMessage());
    }
    File f=new File("demo.txt");
    if (f.delete()) {
        System.out.println("File deleted successfully!");
    } else {
        System.out.println("File doesnt exist.");
    }
    }
}

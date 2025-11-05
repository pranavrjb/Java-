//Count vowels in a string using String.
import java.util.Scanner;
public class String1 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the text: ");
        String input= s.nextLine();
        s.close();

        // String lowerCaseInput=input.toLowerCase();
        int vowelCount=0;

        for (int i=0;i<input.toLowerCase().length();i++){
            char ch=input.toLowerCase().charAt(i);

            if (ch=='a'||ch=='e'||ch == 'i' || ch == 'o' || ch == 'u'){
                vowelCount++;
            }
        }
        System.out.println("Total vowels found are: "+ vowelCount);
    }
}
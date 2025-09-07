import java.util.Scanner;
class If_Else{
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if (x>=18) {
            System.out.println("Congratulation, You are eligible for voting!");
        } else {
            System.out.println("Sorry! You are not eligible for voting!");
        }
    }
}
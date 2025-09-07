import java.util.Scanner;
class If_Else_If{
    public static void main(String[] args) {
        int a,b,c;
        
        System.out.print("Enter the value of a: ");
        Scanner sc1=new Scanner(System.in);
        a=sc1.nextInt();

        System.out.print("Enter the value of b: ");
        Scanner sc2=new Scanner(System.in);
        b=sc2.nextInt();
        
        System.out.print("Enter the value of c: ");
        Scanner sc3=new Scanner(System.in);
        c=sc3.nextInt();


        if (a > b && a > c) {
                System.out.println("The greatest number is: "+a );
        } else if(b > c && b > a){
            System.out.println("The greatest number is :"+b);
        }else{
            System.out.println(" The greatest Number is :"+c);
        }
    }
}
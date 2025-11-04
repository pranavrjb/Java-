//try block: contains code that might throw exception.
//catch block: handles the exception
//  try{
//     //code snippet
//  }
//  catch(Exception e){
//     //handling code
//  }

 public class Try {
 
    public static void main(String[] args) {
        try {
           int a = 10/0; 
        } catch (ArithmeticException e) {
           System.out.println("Error: Division by 0 is not allowed!");
        }
        finally{
            System.out.println("This will always run!");
        }
    }
 }
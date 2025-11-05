// Create a class BankAccount with method withdraw(). Throw InsufficientBalanceException if balance < amount.Demonstrate try-catch-finally block with division by zero and print a message in finally.
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}
class BankAccount{
    private double balance;
    public BankAccount(double balance){
        this.balance=balance;
        System.out.println("Account created with a certain balnc: Rs" +balance);
    }
    public double getBalance(){
        return balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException{
        System.out.println("Withdrawn: Rs" + amount);
        if (amount>balance) {
            throw new InsufficientBalanceException(String.format("Transaction failed. Avaiable Balance: Rs ",amount,balance));
        }
        balance -=amount;
        System.out.println("WithDrawal successful. Remaining balance: Rs "+ balance);
    }
}
public class Demo{
    public static void main(String[] args) {
        BankAccount ac=new BankAccount(10000.123);
        try {
            ac.withdraw(4050.5);
        } catch (InsufficientBalanceException e) {
        System.out.println("Transcation error: "+e.getMessage());
        }
        try {
            ac.withdraw(100000.666);
        } catch (InsufficientBalanceException e) {
        System.out.println("Transcation Error: "+e.getMessage());
        System.out.println("Current balance remain: Rs "+ac.getBalance());
        }
        int x=10,y=0;
        try {
            int z= x / y;
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println("Error: "+ e.getMessage());
        }finally{
            System.out.println("Cannot divide by 0");
        }

    }
}


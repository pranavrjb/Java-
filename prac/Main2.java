// Create an abstract class Account with abstract method calculateInterest(). Create SavingAccount and FixedAccount classes and implement the method.
abstract class Account{
protected double balance;

public Account(double initialBalance){
    this.balance=initialBalance;
    System.out.println("Account created with initial balance: "+ this.balance);
}
public abstract void calculateInterest();

public void deposit(double amount){
    this.balance +=amount;
    System.out.printf("Desposited. New balance",amount,this.balance);
 }
}
class SavingAccount extends Account {
    private static final double RATE = 0.05;
    public SavingAccount(double initialBalance){
        super(initialBalance);
    }
    @Override
    public void calculateInterest(){
        double interest= balance * RATE;
        balance +=interest;
        System.out.printf("SAVINGS: ",interest,RATE*100,balance);
    }
}

class FixedAccount extends Account{
    private static final double RATE=0.06;
    public FixedAccount(double initialBalance){
        super(initialBalance);
    }
    @Override
    public void calculateInterest(){
        double interest = balance * RATE;
        balance +=interest;
        System.out.printf("FIXED :",interest,RATE*100,balance);
    }
}
public class Main2 {
    public static void main(String[] args) {
    Account s=new SavingAccount(100000.00);
    Account f=new FixedAccount(50000.00);

    s.calculateInterest();
    f.calculateInterest();
    }
}
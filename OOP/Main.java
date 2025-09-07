class Calulator{
    int a;
    public int add(int n1,int n2){
    int n=n1+n2;
        return n;
    }
}

public class Main {
public static void main(String[] args) {
    Calulator calc= new Calulator();
    int result= calc.add(5,6);
    System.out.println(result);
}
     
}
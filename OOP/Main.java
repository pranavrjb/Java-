class Calulator{
    public int add(int n1,int n2){
    int n=n1+n2;
        return n;

    // int a = n1+n2;
    //     return a;
    }
}

public class Main {
public static void main(String[] args) {
    Calulator obj= new Calulator();
    int result= obj.add(5,6);
    System.out.println(result);
}     
}
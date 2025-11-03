class Calculator{
    //overloading can be defined as the same method name with diff params.
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public double add(double n1, int n2){
        return n1+n2;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        int n=obj.add(15,10);
        int num=obj.add(11,12 , 13);
        int num1=(int) obj.add(11.33,15 );
        System.out.println(n);
        System.out.println(num);
        System.out.println(num1);
        
    }
}

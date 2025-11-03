class MathCalc{
   int add(int x, int y,int z){
        return x + y * z;
    }
}
public class ParametersAndReturn {
    public static void main(String[] args) {
    MathCalc m=new MathCalc();
    System.out.println(m.add(3,5,2));
    }
}

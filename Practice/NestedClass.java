class Outer{
    int x=10;
    class Inner{
        void display(){
            System.out.println("x = "+ x);
        }
    }
}
public class NestedClass {
   public static void main(String[] args) {
    Outer.Inner b=new Outer().new Inner();
    b.display();
   } 
}

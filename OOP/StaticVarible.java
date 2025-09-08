class Mobile{
    String brand;
    int price;
    static String name;

    public void display(){
        System.out.println(brand + ":" + price + ":" +name);
    }
}
public class StaticVarible{
    public static void main(String[] args) {
        Mobile mb=new Mobile();
        Mobile mb1=new Mobile();
        
        mb.brand="Samsung";
        mb.price=200000;

        mb1.brand="Apple";
        mb1.price=230000;
        
        Mobile.name="Smart-Phone";
        
        mb.display();
        mb1.display();
    }
}
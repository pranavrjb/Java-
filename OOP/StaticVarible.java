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
        Mobile mb2=new Mobile();
        
        mb.brand="Samsung";
        mb.price=200000;

        mb1.brand="Apple";
        mb1.price=230000;

        mb2.brand="Oppo";
        mb2.price=23000;

        Mobile.name="Smart-Phone";
        
        mb.display();
        mb1.display();
        mb2.display();
    }
}
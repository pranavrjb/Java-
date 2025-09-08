class Mobile{
    String brand;
    int price;
    static String name;

    public void display(){
        System.out.println(brand + ":" + price + ":" +name);
    }
    public static void show(Mobile mb){
        System.out.println(mb.brand + ":"+ mb.price + ":" +name);
    }
}
public class StaticMethod {
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
        Mobile.show(mb);
    }
}

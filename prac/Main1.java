// Create a class hierarchy Shape -> Rectangle, Circle. Use super to call parent constructor
class Shape{
  protected String color;
  public Shape(String color){
    this.color=color;
    System.out.println("The color of a shaped is: "+ this.color);
  }
}

class Rectangle extends Shape{
    private int length;
    private int breadth;
    public Rectangle(int length,int breadth,String color){
        super(color);
        this.length=length;
        this.breadth=breadth;
    }
    public void show(){
        int area=length * breadth;
        System.out.println("The Area of Rectangle is :"+area);
    }
}
class Circle extends Shape{
    private int radius;
    public Circle(String color, int radius){
        super(color);
        this.radius=radius;
    }

    public void show(){
        double area=Math.PI *radius*radius;
        System.out.println("Area of Circle is: "+area);
    }
}
public class Main1{
    public static void main(String[] args) {
        Rectangle rect=new Rectangle(6,  5, "red");
        Circle cir=new Circle("Green", 7);
        rect.show();
        cir.show();

    }
}
//Create an interface Shape with method draw(). Implement Rectangle and Circle classes. Call draw() for both objects.

interface Shape{
public void draw();
double getArea();
}
class Circle implements Shape{
    private int radius;
    //constructor
    public Circle(int radius){
        this.radius=radius;
    }
    @Override
    public void draw(){
        System.out.println("Drawing the circle with radius: "+ radius);
    }
    @Override
    public double getArea(){
       return Math.PI*radius*radius;
        
    }
}

class Rectangle implements Shape{
    private int length;
    private int breadth;
    //constructor
    public Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    public void draw(){
        System.out.println("Drawing the rectange using length and breadth:" + length + " x "+ breadth);
    }
    @Override
    public double getArea(){
        return (double)length*breadth;
    }
}
public class Main{
    public static void main(String[] args) {

       Shape circle=new Circle(7);
       circle.draw();
       System.out.println(circle.getArea());
       Shape rect=new Rectangle(5,3);
        rect.draw();
        System.out.println(rect.getArea()); 

    }
}
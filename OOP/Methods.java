class Computer{
    
    //Method is a block of code designed to perform a specific task and is executed when it is called or invoked.
    
    public void playMusic(){
        System.out.println("Playing Music");
    }
    public String getMeAPen(int cost){
        if (cost >=10) {
            return "Pen";
        } else {
            return "Sorry! The cost of Pen is minimum Rs 10";
        }
    }
}
public class Methods {
    public static void main(String[] args) {
        Computer obj=new Computer();
        obj.playMusic();
        String str=obj.getMeAPen(5);
        System.out.println(str);
    }
}

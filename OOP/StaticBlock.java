class Demo {
    static int num;
    static {
        num = 10;
        System.out.println("Static block executed");
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println(Demo.num);
    }
}

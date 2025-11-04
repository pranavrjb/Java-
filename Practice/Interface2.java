//multiple inheritance using interfaces.
interface A{
    void show();
}
interface B{
    void display();
}

class Test implements A,B{
    public void show(){System.out.println("Show!");}
    public void display(){System.out.println("Display!");}
}

public class Interface2 {
public static void main(String[] args) {
    Test t=new Test();
    t.show();
    t.display();
}
}

// Diff between Abstract class and Interface
// Abstract                                    Interface
// One class at a  time                        multiple interface can be implements
// When classes share  common code             When u just need a contract or rules.
// Can be normal or final                      Always public static final
// its keyword is abstract                     its keyword is interface.
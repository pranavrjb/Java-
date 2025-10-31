class Student {
    // private fields (data hiding)
    private String name;
    private int age;

    // public getter method
    public String getName() {
        return name;
    }

    // public setter method
    public void setName(String name) {
        this.name = name;
    }

    // public getter method
    public int getAge() {
        return age;
    }

    // public setter method with control
    public void setAge(int age) {
        if (age > 0) {   // only allow positive age
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class TestEncapsulation {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Alice");   // set name
        s.setAge(20);         // set valid age
        System.out.println(s.getName() + " is " + s.getAge() + " years old");

        s.setAge(-5); // invalid, will be controlled
    }
}

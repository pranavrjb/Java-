class Student {
    private String name;  // private variable
    private int age;

    // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    // getter for age
    public int getAge() {
        return age;
    }

    // setter for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age! Must be greater than 0.");
        }
    }
}

public class TestGetterSetter {
    public static void main(String[] args) {
        Student std = new Student();

        // using setter to set values
        std.setName("Alice");
        std.setAge(20);

        // using getter to access values
        System.out.println("Student: " + std.getName());
        System.out.println("Age: " + std.getAge());

        // try invalid age
        std.setAge(-5);
    }
}

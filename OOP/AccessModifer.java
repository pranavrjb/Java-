 public class AccessModifer {
    private String car= "Tesla";
    public void show(){
        System.out.println("Car: "+car);
    }
    public static void main(String[] args) {
        AccessModifer obj=new AccessModifer();
        obj.show();
    }
}

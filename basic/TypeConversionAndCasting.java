class TypeConversionAndCasting{
    public static void main(String[] args) {
    //Implicit Casting
    int num=10;
    double d=num;
    // Here, int is 4 bytes and Int automatically converted to double i.e 8 byte.

    System.out.println("Interger Value: "+ num);
    System.out.println("Double value {after implicit}: "+ d);

    //Casting or Explicit Casting
    double d1=9.89;
    int n=(int)d1;
    System.out.println("Double Value: "+d1);
    System.out.println("Integer value after explicit: "+n);
        
    }
}
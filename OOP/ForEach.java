class Student{
String Name;
    int RollNo;
    int marks;
}    

public class ForEach {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.Name="Cartier";
        s1.RollNo=15;
        s1.marks=50;
         Student s2=new Student();
        s2.Name="Ram";
        s2.RollNo=11;
        s2.marks=66;
         Student s3=new Student();
        s3.Name="Jenny";
        s3.RollNo=25;
        s3.marks=76;

        Student[] s=new Student[3];
        s[0]=s1;
        s[1]=s2;
        s[2]=s3;

        //for(datatype variable:collection_or_array)
        for(Student stud:s){
            System.out.println(stud.Name + ":" + stud.marks);
        }
    }
}

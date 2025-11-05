//create a class named Course with data member title, credit and course Code and a method named void setvALUES() TO ASSIGN THE value and another method named showValues to dispaly the record. In main () insitantiate 5 obj of course and display the record of course title with C

import java.util.Scanner;

class Course{
    String title;
    int credit;
    String courseCode;

    public void setValues(String t, int cre,String cc){
        title=t;
        credit=cre;
        courseCode=cc;
    }
    public void showValues(){
        System.out.println(" Title "+ title + " Credit "+ credit + "Course-Code "+ courseCode);
    }
}
 public class Courses {
 
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Course[] c=new Course[5];
        for (int i =0;i<5;i++){
            c[i] =new Course();
            System.out.println("\nEnter the details for course: "+ (i+1)+":");
            System.out.print("Title: ");
            String title=s.nextLine();
            System.out.print("Credit: ");
            int credit=s.nextInt();
            System.out.print("Course Code :");
            String courseCode=s.nextLine();
            c[i].setValues(title, credit, courseCode);
        }
        System.out.println("\nCourses that start with C: ");
        for (int i=0;i<5;i++){
            if(c[i].title.startsWith("c") || c[i].title.startsWith("C")){
                c[i].showValues();
            }
        }
        s.close();
    }
 }
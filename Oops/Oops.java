package Oops;

class Student {
    String name;
    String roll;
    float CGPA;

    Student(String Student_name,String roll_no,float cgpa){
        name=Student_name;
        roll=roll_no;
        CGPA=cgpa;
    }
}
public class Oops{
    public static void main(String [] args){

        Student Student1 = new Student("mukul", "23831A66D8",8.5f);
        // Students() is a special function called CONSTRUCTOR.
        // It helps us to initialise the values for the objects,in class

        System.out.println(Student1.name);
        System.out.println(Student1.roll);
        System.out.println(Student1.CGPA);
    }
}

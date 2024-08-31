package Oops;

class Student {
    String name;
    String roll;
    float CGPA;

    // Default Constructor.
    Student(){
        name = "MukuL_Pretham";
        roll = "23831A66D8";
        CGPA = 8.4f;
    }

    // Constructor with parameters.
    Student(String Student_name,String roll_no,float cgpa){
        name=Student_name;
        roll=roll_no;
        CGPA=cgpa;
    }
}
public class Oops{
    public static void main(String [] args){
        Student Student1 = new Student();
        Student Student2 = new Student("Ram", "23831A6669",8.5f);
        // Students() is a special function called CONSTRUCTOR.
        // It helps us to initialise the values for the objects,in class

        System.out.println(Student1.name);
        System.out.println(Student1.roll);
        System.out.println(Student1.CGPA);

        System.out.println(Student2.name);
        System.out.println(Student2.roll);
        System.out.println(Student2.CGPA);
    }
}

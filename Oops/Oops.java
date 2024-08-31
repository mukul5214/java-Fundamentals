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
        this.name=Student_name;  //"this" is used to specifiy the object.
        this.roll=roll_no;
        this.CGPA=cgpa;
    }
    // calling a constructor from a constructor.
    Student(Student Student2){
        this.name = Student2.name;
        this.roll = Student2.roll;
        this.CGPA = Student2.CGPA;
    }
}
public class Oops{
    public static void main(String [] args){
        Student Student1 = new Student();
        Student Student2 = new Student("Ram", "23831A6669",8.5f);
        Student Student3 = new Student(Student2);
        // Students() is a special function called CONSTRUCTOR.
        // It helps us to initialise the values for the objects,in class

        //Using a default constructor.
        System.out.println(Student1.name);
        System.out.println(Student1.roll);
        System.out.println(Student1.CGPA);

        // Using a Paramerized Constructor.
        System.out.println(Student2.name);
        System.out.println(Student2.roll);
        System.out.println(Student2.CGPA);

        // calling a constructor from a constructor .
        System.out.println(Student3.name);
        System.out.println(Student3.roll);
        System.out.println(Student3.CGPA);
    }
}

package Oops;

class Student {
    String name;
    String roll;
    float CGPA;
}
public class Oops{
    public static void main(String [] args){
        Student Student1 = new Student();
        Student1.name="Mukul Preterm";
        Student1.roll= "23831A66D8";
        Student1.CGPA= 8.4F;

        System.out.println(Student1.name);
        System.out.println(Student1.roll);
        System.out.println(Student1.CGPA);
    }
}

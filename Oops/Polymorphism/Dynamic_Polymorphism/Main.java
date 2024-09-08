package Oops.Polymorphism.Dynamic_Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes obj1 = new Shapes();
        Square obj2 = new Square();
        Circle obj3 = new Circle();

        Shapes obj4 = new Circle();
        //Parent class can refer to child class. but not vise versa as we learned in inheritance.
        //TYPE OF OBJECT DETERMINES WHICH OVERRIDDEN METHOD TO CALL.

        obj3.area();
        //Here the object is Circle type so even if area() method is defined with same name and return
        // type in there respective classes the area() method of Circle class overrides the area() of the
        // parent class Shapes.

        obj4.area();
        //  Even though the ref type of the object is Shapes but the object created is of type Circle
        // So the method area() of Shapes is overridden by area() method of Circle.

        // FINALLY WE CAN CONCLUDE THAT REF TYPE DETERMINES WHAT VARIABLE IT CAN ACCESS
        // AND OBJECT TYPE  DETERMINES WHAT VERSION OF OVERRIDDEN METHOD TO ACCESS.
    }
}

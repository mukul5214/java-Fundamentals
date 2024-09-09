package Oops.Inheritance;

public class BoxWeight extends Box {
    double weight;

    BoxWeight(){
        this.weight= 2;
    }

    BoxWeight(double length , double height , double width, double weight){
        super(length,height,width);
        //super() is used to call the super class or parent constructor, if it's not mentioned
        //the default Box() constructor is called.
        //This is one use of super.
        this.weight= weight;
    }

    //another use of super is to refer the variable of super class
    //this helps because if both parent and child class has a same variable ,lets say weight is also
    //present in Box class(PARENT), IF WE WANT TO ACCESS THE WEIGHT IN PARENT CLASS WE USE
    // super.weight , its gives the weight variable of parent(Box)
    // this.weight , it gives weight the weight variable of current class which is child class.

    void print(){
        System.out.println(super.weight);
    }
    // the super keyword can be used to access the shadowed variable of parent class instance variables
    // by the child class instance variable which has same name.
    //But we can the super.member only in subclass and not in any other class.
}

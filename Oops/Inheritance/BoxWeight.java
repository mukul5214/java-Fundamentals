package Oops.Inheritance;

public class BoxWeight extends Box {
    double weight;
    double price;
    BoxWeight(){
        this.weight= 1;
    }
    BoxWeight(double length , double height , double width, double weight){
        super(length,height,width);
        //super() is used to call the super class or parent constructor, if it's not mentioned
        //the default Box() constructor is called.
        //This is one use of super.
        this.weight= weight;
    }

    //Another example in which the super() calls Box(parent)  constructor with single argument.
    BoxWeight(int side, int price ){
        super(side);
        this.price= price;
    }

    //another use of super is to refer the variable of super class
    //this helps because if both parent and child class has a same variable ,lets say weight is also
    //present in Box class(PARENT), IF WE WANT TO ACCESS THE WEIGHT IN PARENT CLASS WE USE
    // super.weight , its gives the weight variable of parent(Box)
    // this.weight , it gives weight the weight variable of current class which is child class.
}

package Oops.Inheritance;

public class Main {
    public static void main(String[] args) {

        BoxWeight box = new BoxWeight(10,20,30,40);


        System.out.println(box.length);
        System.out.println(box.height);
        System.out.println(box.width);
        System.out.println(box.weight);


        //Box box1 = new BoxWeight(1,2,3,4);
        // its allowed because the ref variable type is box and the constructor is Box type
        // and box objects can access the instance variables of Box(l,h,w), only not weight oF BoxWeight.

        //BoxWeight box2 = new Box(1,2,3);
        // object is of BoxWeight and can access weight but the constructor is of Box type
        // box2 of BoxWeight class should have weight variable, which is not present in Box constructor

        // IT'S THE TYPE OF REF VARIABLE WHICH DECIDES WHAT MEMBERS CAN BE ACCESSED, NOT THE OBJECT
        //TYPE.
    }
}

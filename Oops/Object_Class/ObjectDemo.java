package Oops.Object_Class;

import com.sun.jdi.PathSearchingVirtualMachine;

public class ObjectDemo {

    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }// IT GIVES NUMBER REPRESENTATION OF AN OBJECT.IT IS UNIQUE REPRESENTATION OF AN OBJECT.
    //MOTE- HASHCODE IS NOT A ADDRESS ITS A RANDOM NUMBER CREATED THROUGH ALGORITHM.

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }//IT COMPARES THE ACTUAL CONTENTS OF 2 GIVEN OBJECTS UNLIKE "==" OPERATOR WHICH ONLY CHECK
    //IF THE REFERENCE VARIABLES ARE POINTING TOWARDS SAME OBJECT OR NOT.


    //public static void main(String[] args) {
    //    ObjectDemo obj1 = new ObjectDemo(35);//THE TWO NUMBERS ARE SAME BUT 2 DIFFERENT HASHCODES
    //    ObjectDemo obj2 = new ObjectDemo(35);//ARE GENERATED.
    //    System.out.println(obj1.hashCode());
    //    System.out.println(obj2.hashCode());
    //}

    public static void main(String[] args) {
        ObjectDemo obj3 = new ObjectDemo(35);
        ObjectDemo obj4 = new ObjectDemo(35);

        if(obj3 == obj4){
            System.out.println("the given 2 objects are same");
        }// EVEN THOUGH THE TWO VALUES OF THE OBJECTS ARE SAME IT DOES NOT PRINT BECAUSE THOSE TWO ARE
        //2 DIFFERENT OBJECTS. THAT IS ONE DRAWBACK OF "==" OPERATOR.

        if(obj3.equals(obj4)){
            System.out.println("the given 2 objects are same");
        }//THIS ONR PRINTS BECAUSE IT COMPARE 2 DIFFERENT OBJECTS UNLIKE "==" OPERATOR.
    }
}
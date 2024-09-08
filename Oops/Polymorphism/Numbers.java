package Oops.Polymorphism;

public class Numbers {
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a , int b ,int c){
        return a+b+c;
    }
    // above we can see that there are 2 methods which have different number of arguments.
    // methods with same name but different return types, arguments, order acts differently
    //Based on the object created is called static or compile time polymorphism.
    //THIS IS ALSO KNOWN AS METHOD OVERLOADING

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        System.out.println(obj.sum(1,2));
        System.out.println(obj.sum(1,2,3));
        //above he 2 methods with name with different arguments is called
        //So the result also differs according to what type of method is called.
        //same method but acts differently.
        
    }
}


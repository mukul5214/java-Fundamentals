package Oops.Exception_Handiling;

public class Main {
    public static void main(String[] args) throws ArithmeticException {
        int a = 4;
        int b = 0;
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
//            System.out.println(e.getMessage());
            throw new ArithmeticException("0 is not allowed");
        }finally {
            System.out.println("Don't divide by zero");//The code will execute if we use finally
        }
        System.out.println("END");//IF EXCEPTION IS PRESENT BEFORE THIS THIS PART WILL NOT PRINT
        //BUT BY USING FINALLY KEYWORD THE BLOCK WILL RUN EVEN THERE IS EXCEPTION.

//        if(b==0){
//            throw new ArithmeticException("whatt"); //We can write our own message
//        }
//        System.out.println(a/b);
    }
}

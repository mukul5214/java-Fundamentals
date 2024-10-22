package Oops.Multithreading;

public class Main {
    public static void main(String[] args) {
        Multi1 t1 = new Multi1();
        Multi2 t2 = new Multi2();
        t2.start();
        t1.start();
    }
}

package Oops.Multithreading.UsingInterfaces;

public class Main {
    public static void main(String[] args) {
        Multi1 t1 = new Multi1();
        Multi2 t2 = new Multi2();
        //We first create objects of the classes which will implement Runnable class and
        // Create threads seperatly and use start() method through objects of the thread
        Thread T1 = new Thread(t1);
        Thread T2 = new Thread(t2);
        T1.start();
        T2.start();
    }
}
/* In java multithreading we can do it by 2 methods one is extending threads and another
* is by implementing Runnable class . Here implementing the Runnable is more flexible
* because if we extend Threads then that class cannot extend another class but using
* implementation we can implement multiple classes achieving multiple inheritance */
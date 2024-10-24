package Oops.Multithreading.Naming;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println(t1.getName());
        t1.start();
        t1.join();
        t1.setName("Thread x");
        System.out.println(t1.getName());

        /*The thread name is called and printed amd the it is started
        * the main thread waits till t1 finishes and then we change thread name to Thread x
        * and print it */

        /*getName() returns the thread name (String)
        * setName(String name) changes the thread name to name*/

    }
}

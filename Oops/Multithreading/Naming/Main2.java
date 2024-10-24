package Oops.Multithreading.Naming;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t0 = new MyThread();
        MyThread t1 = new MyThread("Thread x");

        System.out.println(t0.getName());
        System.out.println(t1.getName());

        System.out.println(t1.getName() + " starts ");

        t1.start();

        System.out.println("name update");
        t1.setName("Thread z");
        System.out.println("UPDATED TO "+ t1.getName() );

        t1.join();

        System.out.println(t1.getName() + " ENDED");

    }
}

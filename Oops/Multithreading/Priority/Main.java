package Oops.Multithreading.Priority;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread t0 = new MyThread("Thread 0");
        MyThread t1 = new MyThread("Thread 1");

        // Print default priorities (normally 5 for new threads)
        System.out.println("Default Priority of t1: " + t1.getPriority());
        System.out.println("Default Priority of t0: " + t0.getPriority());

        // Set the main thread priority (though this may not affect the other threads)
        Thread.currentThread().setPriority(5); // Changing the priority of the main thread to 5
        System.out.println("Main thread priority: " + Thread.currentThread().getPriority());

        // Set thread priorities
        t0.setPriority(2);  // Lower priority (less likely to get CPU time)
        t1.setPriority(10); // Higher priority (more likely to get CPU time)

        // Start the threads
        t0.start();
        t1.start();
    }
}


package Oops.Multithreading.Priority;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread t0 = new MyThread("Thread 0");
        MyThread t1 = new MyThread("Thread 1");

        // Print default priorities (normally 5 for new threads)
        System.out.println("Default Priority of t1: " + t1.getPriority());
        System.out.println("Default Priority of t0: " + t0.getPriority());

        // Set the main thread priority (though this may not affect the other threads)
        Thread.currentThread().setPriority(3); // Changing the priority of the main thread to 3
        System.out.println("Main thread priority: " + Thread.currentThread().getPriority());

        System.out.println(t0.getPriority());//Returns int(Priority)

        // Set thread priorities (Between 1 and 10)
        try{
            t0.setPriority(2);  // Lower priority (less likely to get CPU time)
            t1.setPriority(10);  // Higher priority (more likely to get CPU time)
        }catch (IllegalArgumentException e ){
            System.out.println("the arguments should be between one and ten");
            //IllegalArgumentException is thrown if the arguments are not in between 1-10.
        }

        // Start the threads
        t0.start();
        t1.start();
    }
}

/*By default every thread priority is 5 (priority ranges from 1 to 10*/

/* If 2 threads have same priority then its up to java scheduler in JVM*/

/* all the thread made in the main thread are its child threads
* the priority of a thread is the priority of the main thread when it creates the child thread
* */



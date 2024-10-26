package Oops.Synchronization.SynchronizationMethods;

public class Main {
    public static void main(String[] args) {
        Loop obj = new Loop();
        MyThread t1 = new MyThread(obj);
        MyThread1 t2 = new MyThread1(obj);
        t1.start();
        t2.start();
    }
}

/*In the threads we created in this package are trying to access the same resource i.e print()

* To avoid interruption among threads while executing the same method, we synchronize the
* print() method. So that the obj is locked and key for the fields of that class are
* available to one thread at at time */

/*
Without synchronization, the output may vary each time the program is run.
This variability occurs because multiple threads can access the shared print() method simultaneously,
leading to interleaved outputs. The JVM allocates CPU time to each thread, which can differ between executions.
*/

/*
 * We can use synchronized blocks with a specific object as the lock, like:
 *   synchronized(sd) {
 *       // Code to synchronize
 *   }
 * This allows us to synchronize only a portion of a method. For example, if a method has 50 lines of code
 * but only 10 lines need to be synchronized, we can enclose those 10 lines in a synchronized block.
 * This provides better performance by limiting synchronization to only the necessary code.
 */

/*
 * By declaring a static method as synchronized, we synchronize on the class itself rather than on an instance.
 * This means that only one thread can execute any static synchronized method of that class at a time,
 * even if there are multiple instances of the class. This is useful when we want to ensure synchronized
 * access across all instances of a class.
 */





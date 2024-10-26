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

* To avoid interruption among threads while executing the same method we synchronize the
* print() method so that the obj is locked and key for the fields of that class are
* available to one thread at at time */

/*
Without synchronization, the output may vary each time the program is run.
This variability occurs because multiple threads can access the shared print() method simultaneously,
leading to interleaved outputs. The JVM allocates CPU time to each thread, which can differ between executions.
*/



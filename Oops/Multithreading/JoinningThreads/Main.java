package Oops.Multithreading.JoinningThreads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1("Thread 1");
        Thread1 t2 = new Thread1("Thread 2");
        Thread1 t3 = new Thread1("Thread 3");
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        System.out.println("Main thread exit");
        for(int i = 0 ; i < 8 ; i++){
            System.out.println(i);
        }
        System.out.println("Main thread exit");
    }
}
/*In above program there are 3 threads Main thread, t1 , t2.
* now t1.start() is a call to main thread to start t1 thread
* t1.join() tells main thread to wait till t1 finished and then continue to next line of code
* after t1 finished the main thread will start t2 and go to next line
* which tells t2.join which means that main thread should wait until t2 is finished and then
* the main thread continues its own loop and exits */

/*join(int ms) tells main method to wait until either the thread execution finished or
* ms have passed*/

/*With join() method we were able to control the flow of program
* Without the join method the main thread will start() t1 and t2 and prints its loop
* and print statement and exits loop almost immediately but finishing of t1 and t2 takes time
* due to sleep the main method will not wait for t1 and t2 to finish  */

/*``````t1.start();
        t2.start();
        t1.join();
        t2.join();

 This will make sure that the main method is finished till t1 and t2 complete execution*/
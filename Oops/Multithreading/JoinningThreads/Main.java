package Oops.Multithreading.JoinningThreads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1("Thread 1");
        Thread1 t2 = new Thread1("Thread 2");
        Thread1 t3 = new Thread1("Thread 3");
        t1.start();
        t2.start();
        try {
            t1.join();  // Main thread waits for t1 to finish
            t2.join();  // Main thread waits for t2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }// Join ensures that main thread is finished only when t1 and t2 are finished
        System.out.println("Main thread exit");
        for(int i = 0 ; i < 8 ; i++){
            System.out.println(i);
        }


    }
}

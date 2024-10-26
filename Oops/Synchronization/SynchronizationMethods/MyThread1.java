package Oops.Synchronization.SynchronizationMethods;

public class MyThread1 extends Thread {
    Loop L;
    MyThread1(Loop L){
        this.L = L;
    }
    public void run(){
        try {
            L.print(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

package Oops.Synchronization.SynchronizationMethods;

public class MyThread extends Thread{
    Loop L;
    MyThread(Loop L){
        this.L = L;
    }
    public void run(){
        try {
            L.print(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

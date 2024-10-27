package Oops.Synchronization.SynchronizationMethods;

public class Loop {
    void print(int n) throws InterruptedException {
        for ( int i = 0 ; i < 10 ; i++){
            System.out.println(i*n);
            Thread.sleep(100);
        }

    }
}

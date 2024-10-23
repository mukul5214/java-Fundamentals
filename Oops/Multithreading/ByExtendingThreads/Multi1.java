package Oops.Multithreading.ByExtendingThreads;

public class Multi1 implements Runnable {
    public void run(){
        for (int i = 0 ; i  < 10 ; i++){
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

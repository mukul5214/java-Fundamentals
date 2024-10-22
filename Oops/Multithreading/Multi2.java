package Oops.Multithreading;

public class Multi2 extends Thread {
    public void run(){
        for ( int i = 0 ; i < 10 ; i++){
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}

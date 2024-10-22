package Oops.Multithreading;

public class Multi1 extends Thread{
    public void run(){
        for ( int i = 0 ; i < 20 ; i++){
//            try {
//                sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            System.out.println(i);
        }
    }
}

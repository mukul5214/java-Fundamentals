package Oops.Multithreading.UsingInterfaces;

public class Multi2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
//        for ( int i = 0 ; i < 10 ;i++){
//            System.out.println("mukullll");
//        }runs randomly
    }
}

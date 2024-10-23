package Oops.Multithreading.ByExtendingThreads;

public class Multi2 implements Runnable{
    public void run(){
        for (int i = 0 ; i < 10 ;i++){
            System.out.println("Mukul");
            try {
                Thread.sleep(500);//sleep is a static method so we access it through class itself
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

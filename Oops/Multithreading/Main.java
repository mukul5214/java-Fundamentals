package Oops.Multithreading;

public class Main {
    public static void main(String[] args) {
        Multi1 t1 = new Multi1();
        Multi2 t2 = new Multi2();
        t2.start();
        t1.start();//These 2 threads are not sheduled so the thread which executes faster will
                   // get executed first
    }
}

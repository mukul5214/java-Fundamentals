package Oops.Synchronization.SynchronizationMethods.Example1;

class Printer{
    synchronized void print(int value) throws InterruptedException {
        for (int i =0 ; i < value ; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println("Exception occured");
            }
        }
    }
}

class MyThread1 extends Thread{
    Printer p;
    int value;
    MyThread1(Printer p , int value){
        this.p = p;
        this.value = value;
    }
    public void run(){
        try {
            p.print(value);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class Synchronisation {
    public static void main(String[] args) {
        Printer p = new Printer();
        MyThread1 t1 = new MyThread1(p,10);
        MyThread1 t2 = new MyThread1(p , 15);
        MyThread1 t3 = new MyThread1(p , 20);

        t1.start();
        t2.start();
        t3.start();
    }

}

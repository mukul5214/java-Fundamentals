package Oops.Multithreading.Priority;

public class MyThread extends Thread {
    private String name;
    MyThread(){
        super();
    }
    MyThread(String name ){
        this.name = name;
    }

    public void run(){

        for(int i = 0 ; i < 10 ; i++){
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            System.out.println(name + "RUNNING");
        }
    }

}

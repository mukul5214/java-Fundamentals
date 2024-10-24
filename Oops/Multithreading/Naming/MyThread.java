package Oops.Multithreading.Naming;

public class MyThread extends Thread{
    MyThread(){
        super();        
    }
    MyThread(String name ){
        super(name);
    }
    public void run(){
        for(int i = 0 ; i < 10 ; i++){
            System.out.println(i);
        }
    }
}

package Oops.Multithreading;

import java.util.Random;

class Even extends Thread{
    int x;
    Even(int x){
        this.x = x;
    }
    public void run(){
        System.out.println("number is even result = "+ x*x);
    }
}

class Odd extends Thread{
    int x;
    Odd(int x){
        this.x = x;
    }
    public void run(){
        System.out.println("number is odd result = "+ x*x*x);
    }
}

class RandomEx extends Thread{
    Random r;
    Thread t1;
    Thread t2;
    public void run(){
        int num = 0;
        r = new Random();

        for(int i = 0 ; i< 50 ; i++){
            num = r.nextInt(100);
            if(num % 2 == 0){
                t1 = new Even(num);
                t1.start();
            }else {
                t2 = new Odd(num);
                t2.start();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

public class Main {
    public static void main(String[] args) {
        RandomEx a = new RandomEx();
        a.start();
    }
}

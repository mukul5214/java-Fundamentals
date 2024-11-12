package Oops.Synchronization;

import java.util.LinkedList;
import java.util.Queue;

class Buffer {
    private final Queue<Integer>queue = new LinkedList<>();
    int maxSize;
    Buffer(int maxSize){
        this.maxSize = maxSize;
    }
    synchronized void producer(int value) throws InterruptedException {
        while (queue.size()==maxSize){
            wait();
        }
        queue.add(value);
        System.out.println("Produced value :" + queue.peek());
        notifyAll();
    }
    synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()){
            wait();
        }
        int value = queue.poll();
        System.out.println("Consumed value : "+value);
        notifyAll();
        return value;
    }
}

class Producer extends Thread{
    Buffer buffer;
    Producer(Buffer buffer){
        this.buffer = buffer;
    }
    public void run(){
        for(int i = 0 ; i <= 10 ; i++){
            try {
                buffer.producer(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
class Consumer extends Thread{
    Buffer buffer;
    Consumer(Buffer buffer){
        this.buffer = buffer;
    }
    public void run() {
        for(int i = 0 ; i <= 10 ; i++){
            try {
                buffer.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Buffer b = new Buffer(2);
        Producer p = new Producer(b);
        Consumer c = new Consumer(b);
        p.start();
        c.start();
    }
}

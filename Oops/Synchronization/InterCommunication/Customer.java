package Oops.Synchronization.InterCommunication;

public class Customer {
    int amount = 10000;
    synchronized void withdraw(int amount) throws InterruptedException {
        System.out.println("withdrawing process started ");
        if(this.amount < amount){
            System.out.println("low balance waiting  for deposite");
            wait();// This method hands over the key and waits for notification from the other thread.
        }
        System.out.println("withdraw completed");
    }

    synchronized void deposite(int amount){
        this.amount =+ amount;
        System.out.println("deposite completed ");
        notify();// Hands over the key to back to previous thread.
    }
}

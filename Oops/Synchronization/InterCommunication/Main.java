package Oops.Synchronization.InterCommunication;

public class Main {
    public static void main(String[] args) {
        Customer c = new Customer();

        /*Normally we create a class which extends Thread class or implements runnable
        * to create a thread . But below we create a Thread and impplement run() method
        * and start in Main class, this reduces memory for more efficient working */

        new Thread() {
            public void run() {
                try {
                    c.withdraw(100000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }.start();

        new Thread() {
            public void run() {
                c.deposite(100000);
            }
        }.start();
    }
}

/*The need for synchronization in your example arises from the fact that both threads are
 accessing methods of the same class (Customer) that manipulate shared data
 (the account balance).*/

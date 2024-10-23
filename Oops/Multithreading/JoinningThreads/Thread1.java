package Oops.Multithreading.JoinningThreads;

public class Thread1 extends Thread{
    private String name;
    public Thread1(String name ){
        this.name = name;
    }
    public void run(){
        System.out.println(name + "starts");
        for(int i = 0 ; i < 10 ; i++){
            try {
                System.out.println(name + " "+i);
                Thread.sleep(100);
            }catch (Exception e){
                System.out.println("exception found");
            }
        }
        System.out.println(name + "finished");
    }
}

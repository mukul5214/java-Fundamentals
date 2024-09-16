package Oops.Interfaces;

public class Media implements Media_Player {

    @Override
    public void start(){
        System.out.println("Media player starts");
    }

    @Override
    public void stop(){
        System.out.println("Media player stops");
    }
}

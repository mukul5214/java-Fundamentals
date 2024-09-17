package Oops.Interfaces;

public class Main{
    public static void main(String[] args) {
        MyCar car1 = new MyCar();
        car1.start();
        car1.stop();
        car1.StartCD_player();
        car1.StopCD();
        car1.brake();
        car1.releaseBrakes();
    }
}

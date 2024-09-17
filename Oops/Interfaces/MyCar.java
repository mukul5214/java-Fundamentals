package Oops.Interfaces;


import Oops.carBrakes;

public class MyCar {
    private Engine MyEngine;
    final private Media_Player CD_Player;
    final private Brakes hydoBrakes;

    public MyCar() {
        MyEngine = new PowerEngine();
        CD_Player = new Media();
        hydoBrakes = new carBrakes();
    }


    void start(){
        MyEngine.start();
    }

    void stop(){
        MyEngine.stop();
    }

    void StartCD_player(){
        CD_Player.start();
    }

    void StopCD(){
        CD_Player.stop();
    }

    void brake(){
        hydoBrakes.start();
    }

    void releaseBrakes(){
        hydoBrakes.stop();
    }

    void upgrade_engine(){
        this.MyEngine = new ElectricEngine();
    }
}

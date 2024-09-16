package Oops.Interfaces;

public class MyCar {
    private Engine MyEngine;
    private Media_Player CD_Player;

    void MyEngine(){
        MyEngine = new PowerEngine();
    }

    void CD_Player(){
        CD_Player = new Media();
    }
    void start(){
        MyEngine.start();
    }

    void stop(){
        this.Engine.stop();
    }

    void StartCD_player(){
        CD_Player.start();
    }

    void StopCD(){
        CD_Player.stop();
    }
}

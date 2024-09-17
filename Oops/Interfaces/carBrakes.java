package Oops;

import Oops.Interfaces.Brakes;

public class carBrakes implements Brakes {
    public void start(){
        System.out.println("Brakes released");
    }

    public void stop(){
        System.out.println("Brakes applied");
    }
}


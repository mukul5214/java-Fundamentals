package Oops.Interfaces;

public class Car implements Engine,Brakes,Media_Player {

    @Override
    public void Brake() {
        System.out.println("Normal brake");
    }

    @Override
    public void start() {
        System.out.println("engine starts");
    }

    @Override
    public void stop() {
        System.out.println("engine stops");
    }

    @Override
    public void acc() {
        System.out.println("engine accelerates");
    }
}

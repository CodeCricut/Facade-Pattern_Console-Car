package model;

public class Engine {
    private boolean engineOn = false;

    public boolean isOn() {
        return engineOn;
    }

    public void turnOn() {
        System.out.println("Turning engine on...");
        engineOn = true;
    }

    public void turnOff(){
        System.out.println("turning engine off...");
        engineOn = false;
    }
}

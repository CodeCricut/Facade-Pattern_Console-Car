package model;

public class Steering {
    private boolean turnedLeft = false;
    private boolean turnedRight = false;

    public boolean isTurnedLeft() {
        return turnedLeft;
    }

    public boolean isTurnedRight() {
        return turnedRight;
    }

    public void turnLeft() {
        System.out.println("Turning left...");
        turnedRight = false;
        turnedLeft = true;
    }

    public void turnRight() {
        System.out.println("Turning right...");
        turnedRight = true;
        turnedLeft = false;
    }

    public void goStraight(){
        System.out.println("Continuing straight...");
        turnedRight = false;
        turnedLeft = false;
    }
}

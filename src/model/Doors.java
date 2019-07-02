package model;

public class Doors {
    private boolean leftDoorOpen = false;
    private boolean rightDoorOpen = false;

    public void openRightDoor() {
        System.out.println("Opening right door...");
        rightDoorOpen = true;
    }

    public void openLeftDoor() {
        System.out.println("Opening left door...");
        leftDoorOpen = true;
    }

    public void closeRightDoor(){
        System.out.println("Closing right door...");
        rightDoorOpen = false;
    }

    public void closeLeftDoor(){
        System.out.println("Closing left door...");
        leftDoorOpen = false;
    }

    public boolean isRightDoorOpen() {
        return rightDoorOpen;
    }

    public boolean isLeftDoorOpen() {
        return leftDoorOpen;
    }
}

package model;

public class Car {
    private static final char LEFT_DOOR_OPEN_CHAR = '/';
    private static final char RIGHT_DOOR_OPEN_CHAR = '\\';

    private Doors doors;
    private Engine engine;
    private Steering steering;

    public Car(){
        doors = new Doors();
        engine = new Engine();
        steering = new Steering();
    }

    //Public Methods
    public void drawCar(){
        drawEngine();
        drawSteering();
        drawCarBody();
    }

    //Getters and Setters
    public Doors getDoors() {
        return doors;
    }

    public Engine getEngine() {
        return engine;
    }

    public Steering getSteering() {
        return steering;
    }

    //Helper Methods
    private void drawEngine() {
        System.out.println("Engine:");
        if(engine.isOn()){
            System.out.println("( ( (");
            System.out.println(" ) ) )");
        }
        System.out.println(" # # #");
        System.out.println(" #####");
        System.out.println("\n");
    }

    private void drawSteering() {
        if(steering.isTurnedLeft()){
            System.out.println(" \\---\\");
        }
        else if (steering.isTurnedRight()){
            System.out.println(" /---/");
        }
        else{
            System.out.println(" |---|");
        }
    }

    private void drawCarBody() {
        drawDoors();
        System.out.println("  ||| ");
        System.out.println(" |---|");
        System.out.println("=====================================================");

    }

    private void drawDoors() {
        if(doors.isLeftDoorOpen()){
            System.out.print(" /");
        }
        else{
            System.out.print("  ");
        }

        System.out.print("|||");
        if(doors.isRightDoorOpen()){
            System.out.print("\\");
        }
        System.out.println();
    }
}

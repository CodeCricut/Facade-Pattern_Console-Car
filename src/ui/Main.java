package ui;

import model.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.drawCar();
        Engine engine = car.getEngine();
        Steering steering = car.getSteering();
        Doors doors = car.getDoors();

        engine.turnOn();
        steering.turnRight();
        doors.openLeftDoor();
        car.drawCar();

        engine.turnOn();
        steering.goStraight();
        doors.openRightDoor();
        car.drawCar();

        doors.closeLeftDoor();
        car.drawCar();
    }
}

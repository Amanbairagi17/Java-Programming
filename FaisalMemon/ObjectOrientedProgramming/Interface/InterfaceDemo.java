package FaisalMemon.ObjectOrientedProgramming.Interface;

public class InterfaceDemo {
    public static void main(String[] args) {
        CarControls e1 = new ElectricCar();
        e1.applyBreaks();
        e1.turnLeft();
        e1.turnRight();
        e1.startButton();// Same as public method
        CarControls.stop();// We can call static method directly using name of the interface
        CarControls.callHelperInstance();// For accessing private method in the interface

        CarControls c2 = new SportsCar();
        c2.startButton();
        c2.applyBreaks();
    }
}

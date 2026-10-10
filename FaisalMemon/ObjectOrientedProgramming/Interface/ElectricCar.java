package FaisalMemon.ObjectOrientedProgramming.Interface;

public class ElectricCar implements CarControls{
    @Override
    public void turnLeft() {
        System.out.println("Electric Left..");
    }

    @Override
    public void turnRight() {
        System.out.println("Electric Right..");
    }

    @Override
    public void applyBreaks() {
        System.out.println("Electric Breaks..");
    }

    public void testPrivate(){
        CarControls.callHelperInstance();

    }
//    @Override
//    public void startButton() {
//        CarControls.super.startButton();
//    }
}

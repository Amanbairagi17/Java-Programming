package FaisalMemon.ObjectOrientedProgramming.Interface;

public class SportsCar implements  CarControls{
    @Override
    public void turnLeft() {
        System.out.println("Sports Left...");
    }

    @Override
    public void turnRight() {
        System.out.println("Sports Left...");
    }

    @Override
    public void applyBreaks() {
        System.out.println("Sports Left...");
    }

    @Override
    public void startButton() {
        CarControls.super.startButton();
    }
}

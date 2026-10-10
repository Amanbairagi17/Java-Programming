package FaisalMemon.ObjectOrientedProgramming.Interface;

public interface CarControls {
    void turnLeft();
    void turnRight();
    void applyBreaks();

    default void startButton(){
        System.out.println("You can define body of classes using default");
    }

    static void stop(){
        System.out.println("Also can use static while defining body in interface");
    }


    private static void hello(){
        System.out.println("Hello You can also use private keyword");
    }
    static void callHelperInstance(){// Static banana  hi padega
        hello();
    }
}

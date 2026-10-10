package OOPsinJava;

abstract class Car{
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("Play Music ...");
    }
}
abstract class WagonR extends Car{
    public void drive() {
        System.out.println("Driving ..");
    }
}
class UpdatedWagonR extends WagonR{ //Concrete class
    public void fly() {
        System.out.println("Flying ...");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}

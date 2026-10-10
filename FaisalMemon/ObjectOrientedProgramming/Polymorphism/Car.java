package FaisalMemon.ObjectOrientedProgramming.Polymorphism;

public class Car extends Vehicle {
    private int doors;

    Car(String brand, int speed, String fuel, int doors){
        super(brand,speed,fuel);// we use super when we have private attributes in parent class if attributes are public we can intialize value from child class
        this.doors = doors;
        //when parent class attributes are public
//        this.brand = brand;
//        this.fuel = fuel;
//        this.speed = speed;
    }

    @Override
    public void start(){
        System.out.println("Car starting...");
    }
}

package FaisalMemon.ObjectOrientedProgramming.Inheritance;

public class Vehicle {
    private String brand;
    private int speed;
    private String fuel;

    Vehicle(String brand, int speed, String fuel){
        this.brand = brand;
        this.speed = speed;
        this.fuel = fuel;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public String getFuel() {
        return fuel;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
    public void displayInfo(){
        System.out.println(brand +"Have "+fuel+" litre fuel and can run "+speed+"km/h");
    }
}

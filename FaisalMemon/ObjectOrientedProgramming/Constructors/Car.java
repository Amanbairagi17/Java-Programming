package FaisalMemon.ObjectOrientedProgramming.Constructors;

public class Car {
    String name;
    private String brand;
    private int speed;

    public Car(String name, String brand, int speed){
        this.name = name;
        this.brand = brand;
        this.speed = speed;
    }
    public void drive(){
        System.out.println(this.name+" is running at "+this.speed+" Km/h");
    }

    public int getSpeed() {
        return speed;
    }
    public String getBrand(){
        return brand;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
}

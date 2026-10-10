package FaisalMemon.ObjectOrientedProgramming.Encapsulation;

class Car {
    private String brand;
    private String color;
    private int speed;

    public Car(String brand, String color, int speed){
        this.brand = brand;
        this.color = color;
//        this.speed = speed;
        setSpeed(speed);
    }
    public void drive(){
        System.out.println(this.brand+" is running at "+this.speed+" Km/h");
    }

    public int getSpeed() {
        return speed;
    }
    public String getBrand(){
        return brand;
    }
    public void setSpeed(int speed){
        if(speed < 0) speed = 0;
        this.speed = speed;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
}

public class EncapsulationDriver {
    public static void main(String[] args) {
        Car car = new Car("BMW", "black", 300);
        car.drive();
        Car car1 = new Car("Tata","white",-100);
        car1.drive();
    }
}

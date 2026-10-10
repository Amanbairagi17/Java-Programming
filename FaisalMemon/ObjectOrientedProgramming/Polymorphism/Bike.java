package FaisalMemon.ObjectOrientedProgramming.Polymorphism;

public class Bike extends Vehicle {
    private String hasCareer;

    Bike(String brand, int speed, String fuel,String hasCareer){
        super(brand,speed,fuel);
        this.hasCareer = hasCareer;
    }

    public void displayInfo(){
        System.out.println(getBrand()+" have "+getFuel()+" litre fuel "+" can run upto "+getSpeed()+" km/h and carrer is "+hasCareer);
    }

    @Override
    public void start(){
        System.out.println("Bike starting....");
    }

    public void start(String greet){
        System.out.println(greet+" bike is starting...");
    }
}


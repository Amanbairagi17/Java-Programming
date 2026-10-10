package OOPsinJava.HasA;

public class Car {
    String brand;
    String model;
    String color;
    Car(String  brand, String model, String color){
        this.brand = brand;
        this.model = model;
        this.color = color;
    }
    //Early Instantiation
//    Engine e = new Engine(1200, "CD123");
//    public Car(String brand, String model, String color,int hp, String engineNo) {
//        this.brand = brand;
//        this.model = model;
//        this.color = color;
//        this.e=new Engine(hp,engineNo);
//    }
    public void start(){

        System.out.println( brand + "  is Starting ....");
    }
    public void addEngine(int hp, String engineNo){
        Engine e = new Engine(hp, engineNo);
        e.start();
    }


}

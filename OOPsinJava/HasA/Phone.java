package OOPsinJava.HasA;

public class Phone {
    private String model;
    private String color;
    private double price;
    private int password;
    Sim s;
    Phone(String model, String color, double price, int password){
        this.model = model;
        this.color = color;
        this.price = price;
        this.password = password;
    }

// Early Instantiation / Eager Instantiation
//    public Phone(String model, String color, double price,int password,double balance, long phoneNo) {
//        this.model = model;
//        this.color = color;
//        this.price = price;
//        this.password = password;
//        this.s = new Sim(balance, phoneNo);
//    }

    public void getModel(int password) {
        if(this.password == password) {
            System.out.println("Model number is : "+this.model);
        }
        else {
            System.out.println("Enter valid Password");
        }

    }

    public void getColor(int password) {
        if(this.password == password) {
            System.out.println("Model number is : "+this.color);
        }
        else {
            System.out.println("Enter valid Password");
        }
    }

    public void getPrice(int password) {
        if(this.password == password) {
            System.out.println("Model numver is : "+this.price);
        }
        else {
            System.out.println("Enter valid Password");
        }
    }

    public void setModel(String model, int password) {

        if(this.password == password){
            if(model.length() >= 6) System.out.println("Model Number is : " +this.model);
            else System.out.println("Model have at least 6 length");
        }
        else {
            System.out.println("Wrong password");
        }
    }

    public void setColor(String color, int password) {
        if(this.password == password){
            System.out.println("Model Number is : " +this.color);
        }
        else {
            System.out.println("Wrong password");
        }
    }

    public void setPrice(double price, int password) {
        if(this.password == password){
            System.out.println("Model Number is : " +this.price);
        }
        else {
            System.out.println("Wrong password");
        }
    }
    public void PhoneProperties(){
        System.out.println("Phone Model is : "+this.model);
        System.out.println("Color of phone is : "+ this.color);
        System.out.println("Price of phone is : "+this.price);
    }
    public void activeSim(double balance, long phoneNo){
        Sim sim = new Sim(balance, phoneNo);
        sim.displaySim();
    }

    public void addExternalMemory(String brand, double price, String capacity){
        External_Memory m1 = new External_Memory(brand, price, capacity);
        m1.displayMemoryConfiguration();
    }
}

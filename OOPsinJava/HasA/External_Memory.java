package OOPsinJava.HasA;

public class External_Memory {
    private String brand;
    private double price;
    private String capacity;

    External_Memory(String brand, double price, String capacity){
        this.brand = brand;
        this.price = price;
        this.capacity = capacity;
    }



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String toString(){
        return "Brand : " +this.brand+ " Price : "+this.price+ " Capacity : "+this.capacity;
    }
    public void displayMemoryConfiguration(){
        System.out.println(this.brand);
        System.out.println(this.price);
        System.out.println(this.capacity);
    }

}

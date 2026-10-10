package OOPsinJava.UMLPractice1;

import javax.sound.midi.Soundbank;

public  class Bag {
    private String color;
    private double price;

    Bag(String color, double price){
        this.color = color;
        this.price = price;
    }
    Bag(){

    }

    public void getPrice(){
        System.out.println(this.price);
    }
    public void getColor(){
        System.out.println(this.color);
    }
    public void setColor(String color){
        this.color = color;
        System.out.println("Bag color is :" + this.color);
    }
    public void setPrice(double price){
        if(price > 0 && price <= this.price ) {
            this.price += price;
            System.out.println("Current price of bag is :" +this.price);
        }
        else {
            System.out.println("Invalid Price");
        }
    }

    public String toString(){
        return "Color is : " + this.color +" | " + "Price is : "+ this.price;
    }
}

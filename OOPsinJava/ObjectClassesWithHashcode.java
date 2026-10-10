package OOPsinJava;

import java.util.Objects;

class Laptop{
    String brand;
    int price;
    public String toString(){

        return brand +" : "+price;
    }
    public boolean equals(Laptop that){//
        return this.brand.equals(that.brand) && this.price == that.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(brand, laptop.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price);
    }
}
public class ObjectClassesWithHashcode {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.brand="Acer Aspire 5";
        obj1.price=22250;

        Laptop obj2 = new Laptop();
        obj2.brand="Acer Aspire 5";
        obj2.price=22250;

        //boolean ans = obj2==obj1;
        boolean ans = obj2.equals(obj1);// whenever we use inbuilt eqauls method then it return false ,as we write our own equals method in the above laptop class that show true

       // System.out.println(obj.toString());//Laptop@5f184fc6
        System.out.println(ans);
    }
}

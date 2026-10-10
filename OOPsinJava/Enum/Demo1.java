package OOPsinJava.Enum;
enum Laptop{
    Macbook(2000), XPS(1500), ThinkPad, IPad(1800);
    private int price;
    private Laptop(int price){
        this.price=price;
        System.out.println("In laptop class"+this.name());
    }
    private Laptop(){
        price=500;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class Demo1 {
    public static void main(String[] args) {
//        Laptop ll = Laptop.Macbook;
//        System.out.println(ll+" : "+ll.getPrice());
        for (Laptop lap : Laptop.values()){
            System.out.println(lap.ordinal()+" : "+lap+" : "+lap.getPrice());
        }
    }
}

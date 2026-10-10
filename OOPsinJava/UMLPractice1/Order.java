package OOPsinJava.UMLPractice1;

public class Order {
    private String productName;
    private String productId;
    private double price;
    private String paymentMode;

    Order(String productName, String  productId, double price, String paymentMode){
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.paymentMode = paymentMode;
    }
    public void displayOrder(){
        System.out.println("Product Name : "+this.productName);
        System.out.println("Product ID : "+this.productId);
        System.out.println("Price : "+this.price);
        System.out.println("Payment Mode : "+this.paymentMode);
        System.out.println();
    }

}

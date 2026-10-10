package OOPsinJava;
 class Mobile {
    String name;
    static String color;
    String brandName;
    int price;
    public void show(){
        System.out.println(brandName+" : "+name+" : "+price+" : "+color);
    }
    static {
        color="white";
        System.out.println("Static Block : ");
    }
    public Mobile(){
        brandName="";
        price=1000;
        System.out.println("In Constructor");
    }
    public static void show1(Mobile obj){   //
        System.out.println(obj.brandName+" : "+obj.name+" : "+obj.price+" : "+color);
    }
}

public class StaticKeyword {
    public static void main(String[] args) throws ClassNotFoundException {
//        Mobile obj1 = new Mobile();
//        obj1.name="OPPO-T2X";
//        obj1.brandName="OPPO";
//        Mobile.color="red";
//        obj1.price=15500;
//
//        Mobile obj2 = new Mobile();
//        obj2.name= "VIVO V21";
//        obj2.brandName="VIVO";
//        Mobile.color="red";
//        obj2.price=30000;
//        ///Mobile.color="white";
//
//        Mobile.show1(obj2);
//       // obj2.show();
//        obj1.show();
      //  Mobile obj3 = new Mobile();
        Class.forName("OOPsinJava.Mobile");  //load class without creating object 

    }
}

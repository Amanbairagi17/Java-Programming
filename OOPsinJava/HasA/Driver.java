package OOPsinJava.HasA;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
      //  Car c1 = new Car("Mahindra","XUV700","Black");
//        Car c1 =  new Car("Mahindra","XUV700","Black");
//        c1.start();
//        c1.addEngine(1230,"CD123");

        Scanner sc = new Scanner(System.in);

        Phone p = new Phone("POCOM3","Yellow",10000,1111);
        p.PhoneProperties();
        p.activeSim(399,1236263333L);
        System.out.println("If you want External Memory then Enter True else False : ");
        Boolean b = sc.nextBoolean();

        if(b){
            p.addExternalMemory("MyBrand",1000,"2GB");
        }


    }
}

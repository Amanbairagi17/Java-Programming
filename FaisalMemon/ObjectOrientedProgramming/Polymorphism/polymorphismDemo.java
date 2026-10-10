package FaisalMemon.ObjectOrientedProgramming.Polymorphism;


public class polymorphismDemo {
    public static void main(String[] args) {
//        Vehicle v1 = new Vehicle("Hero",100,"10");
//        v1.start();
//        Vehicle v2 = new Car("Mahindra",230,"40",5);
//        v2.start();
//        Vehicle v3 = new Bike("TVS",120,"10","Availble");
//        v3.displayInfo();
        //v3.start("Hello Aman");// We cannot access using vehicle reference variable

//        Car c1 = new Car("Toyota",250,"30 ",6);
//        c1.displayInfo();
//        c1.start();
//        Bike b1 = new Bike("TVS",120,"10","Availble");
//        //Method Overloading
//        b1.start("Hello Aman");


        //Method Overloading
        Calculator c1 = new Calculator();
        System.out.println(c1.add(1,2));
        System.out.println(c1.add(2.3,4));
        System.out.println(c1.add(2.2,9.3));
    }
}

package FaisalMemon.CollectionsFramework;

import java.util.ArrayList;
import java.util.List;

class Car{
    String name;
    Car(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class LIstDemo {
    public static void main(String[] args) {
        List<String>  users = new ArrayList<>();
        users.add("Aman");
        users.add("Bob");
        users.add("Vikash");

        for(String user : users){
            System.out.println(user);
        }
        System.out.println(users);

        Car car1 = new Car("Toyota");
        Car car2 = new Car("Defender");
        Car car3 = new Car("Thar");

        //List of Custom Objects
        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        for (Car car : carList){
            System.out.println("Your car is : "+car.name);
        }

    }
}

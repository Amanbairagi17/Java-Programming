package FaisalMemon.CollectionsFramework;
import java.util.ArrayList;
import java.util.List;

class CarNew{
    String name;
    CarNew(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class GenericsDemo {
    //Generics in Java allow you to create classes, interfaces, and methods that operate on types (data types) as
    // parameters, enabling type safety and code reusability.
    //Generics mean parameterized types — you can define a class or method with a placeholder for the data type.
    public static void main(String[] args) {
        System.out.println("Generics use for type safety ");
        List<String> users = new ArrayList<>();
        users.add("Aman");
        users.add("Bob");
        users.add("Vikash");

        for(String user : users){
            System.out.println(user);
        }
        System.out.println(users);

        CarNew car1 = new CarNew("Toyota");
        CarNew car2 = new CarNew("Defender");
        CarNew car3 = new CarNew("Thar");

        //List of Custom Objects
        List<CarNew> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        for (CarNew car : carList){
            System.out.println("Your car is : "+car.name);
        }

    }
}

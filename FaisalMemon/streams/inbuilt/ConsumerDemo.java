package FaisalMemon.streams.inbuilt;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
       // Consumer<String> consumer1 = (str) -> System.out.println(str + " Aman");
        Consumer<String> consumer1 = System.out::println;

        consumer1.accept("Hello");
        consumer1.accept("Hii");


        List<Integer> list = List.of(1,2,3,4,5);
        list.forEach(n -> System.out.print(n*n+ " "));
        System.out.println();

        Consumer<String> greet = s -> System.out.println("Hello " + s);
        Consumer<String> farewell = s -> System.out.println("Bye " + s);

        greet.andThen(farewell).accept("Aman");

        Consumer<Integer> multiplyBy2 = n -> System.out.println(n*2);
        list.forEach(multiplyBy2);

    }
}

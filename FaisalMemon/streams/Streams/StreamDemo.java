package FaisalMemon.streams.Streams;

import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    //Stream - Assembly line/ Pipeline
    public static void main(String[] args) {

        List<String> fruits = List.of("Apple" , "Banana", "Cherry");
        System.out.println("List using foreach");
        for (String fruit : fruits) System.out.println(fruit);

        Stream<String> items = fruits.stream();
        System.out.println("List using stream pipeline");
        items.forEach(System.out::println);

        //Fruits that start with B
//        Stream<String> items2 = fruits.stream();
//        Stream<String> filteredStream = items2.filter((name) -> name.startsWith("C") );
//        filteredStream.forEach(System.out::println);

         fruits.stream().filter((name) -> name.startsWith("C")).forEach(System.out::println);
        /* Use Cases
        * 1. Filter
        * 2. Mapping
        * 3. Aggregation
        * 4. Searching
        * 5. Iteration */

    }
}

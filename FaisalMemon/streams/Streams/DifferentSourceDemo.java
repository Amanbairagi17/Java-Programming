package FaisalMemon.streams.Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DifferentSourceDemo {
    /* Different Source of Demo
     * 1. From Collections : e.g. collection.stream
     * 2. From Array : e.g Arrays.stream(array)
     * 3. From Specific Values : e.g. Stream.of("a","b","c")
     * 4. From Functions : e.g.stream,Iterate(0, n-> n+2)
     * 5. From Files : e.g. Files.lines(path)
     * 6. From Empty Stream : e.g. Stream.empty() */
    public static void main(String[] args) {

        //Collections -> Stream
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> integerList = numbers.stream().toList();
        integerList.forEach(System.out::println);

        //Arrays -> Stream
        int[] numArray = {2,3,4,5,6,8,9};
        IntStream arrayStream = Arrays.stream(numArray);
        arrayStream.forEach(System.out::println);

        //Values -> Stream
        Stream<String> stringStream = Stream.of("a","b","c");
//        Stream<Integer> integerStream = Stream.iterate(0, n->n+2);
//        integerStream.forEach(System.out::println);

        //Files -> Stream
        try {
            Stream<String> filesStream = Files.lines(Path.of("note.txt"));
        } catch (IOException e) {
//            throw new RuntimeException(e);
            System.out.println("File note Found");
        }

        //Empty Stream
        Stream<Object> emptySteam = Stream.empty();

    }
}

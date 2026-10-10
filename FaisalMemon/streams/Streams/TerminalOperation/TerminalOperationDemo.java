package FaisalMemon.streams.Streams.TerminalOperation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30,40,50,55,49);

        //reduce()
        Stream<Integer> integerStream = numbers.stream();
       // int sum = integerStream.reduce(0,(acc,num) -> acc + num);
        int sum = integerStream.reduce(0, Integer::sum);
        System.out.println("Total Sum : " +sum);

        int total = numbers.stream().reduce(0,Integer::sum);
        System.out.println("Total : " +total);


        //Collect()
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        List<Integer> oddNumbers = numbers.stream().filter(n -> n%2 != 0).collect(Collectors.toList());
        System.out.println("EVEN NUMBERS : "+evenNumbers);
        System.out.println("ODD NUMBERS : "+oddNumbers);


        //find and match
        System.out.println(numbers.stream().findFirst().get());
        System.out.println(numbers.stream().findAny().get());

        boolean has30 = numbers.stream()
                .anyMatch(n-> n == 30);
        System.out.println(has30);

        //Iteration
        numbers.stream().forEach(System.out::println);
    }
}

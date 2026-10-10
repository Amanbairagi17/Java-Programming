package FaisalMemon.optional;

import java.util.Optional;

public class FunctionalOptional {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Java");
        Optional<String> empty = Optional.ofNullable(null);

        //ifPresent
        name.ifPresent((value) ->{
            System.out.println(value);
            System.out.println("Hii Aman");
        });
        empty.ifPresent((value) ->{
            System.out.println(value);
            System.out.println("Hii Aman");
        });

        //map()
        Optional<String> upperCase = name.map(String::toUpperCase);
        System.out.println(upperCase.orElse("default"));

        //filter()
        Optional<String> temp = name.filter(n -> n.startsWith("J"));
        temp.ifPresent(System.out::println);

        //combined Operatioin
        name.map(String::toUpperCase)
                .filter(n-> n.startsWith("J") )
                .ifPresent(System.out::println);


    }
}

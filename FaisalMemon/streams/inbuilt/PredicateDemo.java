package FaisalMemon.streams.inbuilt;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateDemo {
    public static void main(String[] args) {
        //Predicate
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(10));

        //BIPredicate
        BiPredicate<Integer, Integer> isEqual = (a,b) -> (a+b) % 2 != 0;
        System.out.println(isEqual.test(10,2));

        //Supplier
        Supplier<String> greet = ()-> "Hii Aman, How are u";
        System.out.println(greet.get());
        //Supplier<Double> randomNumber = () -> Math.random();
        Supplier<Double> randomNumber = Math::random;
        System.out.println(randomNumber.get());
        System.out.println(randomNumber.get());

    }
}

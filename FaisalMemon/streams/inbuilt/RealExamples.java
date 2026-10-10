package FaisalMemon.streams.inbuilt;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class RealExamples {
    public static void main(String[] args) {
        // <Title> costs <Price>
        BiFunction<String, Double, String> formatter = (title, price) -> title +" costs $ : "+price;
        System.out.println(formatter.apply("Java Basics",299.40));
        System.out.println(formatter.apply("Sql Basics",199.40));
        System.out.println(formatter.apply("Spring Basics",399.40));

        BiConsumer<String, Double> formatter2 = (title, price) -> System.out.println(title +" costs $ : "+price);
        formatter2.accept("Java Basics",299.40);
        formatter2.accept("Sql Basics",199.40);
        formatter2.accept("Spring Basics",399.40);

        Predicate<Double> isExpensive = n -> n >= 500.00;
        System.out.println(isExpensive.test(300.20));
        System.out.println(isExpensive.test(670.00));


    }
}

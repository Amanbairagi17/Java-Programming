package FaisalMemon.streams.inbuilt;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BIFunctionInterfaceDemo {
    //public static BiFunction<Integer, Integer, Integer> addFunction = (a,b) -> a+b;
    public static BiFunction<Integer, Integer, Integer> addFunction = Integer::sum;
    public static BiFunction<Integer, Integer, Integer> subFunction = (a,b) -> a-b;
    public static BiFunction<String, String, String> concat = (s1, s2) -> s1 + s2;

    public static BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
    public static Function<Integer, String> toString = n -> "Result: " + n;

    public static void main(String[] args) {
        System.out.println(addFunction.apply(10,20));
        System.out.println(subFunction.apply(30,2));
        System.out.println(concat.apply("Hello"," Aman"));

        //BiFunction Chaining
        String result = multiply.andThen(toString).apply(4,5);
        System.out.println(result);
    }
}

package FaisalMemon.streams.inbuilt;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        //The BiConsumer<T, U> interface is an inbuilt functional interface in Java (java.util.function) that accepts two inputs
        // and performs an operation on them but does not return any result.
        BiConsumer<Integer, Integer> addition = (a,b) -> System.out.println("Addition : "+(a+b));
        BiConsumer<Integer, Integer> subtraction = (a,b) -> System.out.println("Subtraction : "+(a-b));
        BiConsumer<Integer, Integer> multiplication = (a,b) -> System.out.println("Multiply : "+(a*b));
        addition.andThen(subtraction.andThen(multiplication)).accept(90,9);
    }
}

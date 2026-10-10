package FaisalMemon.streams.inbuilt;

import java.util.function.Function;

public class FunctionInterfaceDemo {

    //It take one input and produce on output
    //Use Function<T, R> when you want to transform or map a value from one type to another. T-> input , R -> result
    //It’s mainly used in Stream API and data transformation operations.
    public static Function<Integer, Integer> addFunction = (a) -> a+10;
    public static Function<Integer, Integer> subFunction = (a) -> 100 - a;
    public  static Function<Integer, Integer> mulFunction = (a) -> a * 8;

    public static Function<Integer, Integer> combineFunction = addFunction.andThen(subFunction);

    public static void main(String[] args) {
        System.out.println(addFunction.apply(20));
        System.out.println(subFunction.apply(30));

        System.out.println();

        //Chaining
        System.out.println(combineFunction.apply(30));// first perform addition then perform subtraction

    }

}

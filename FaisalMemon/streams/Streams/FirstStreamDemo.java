package FaisalMemon.streams.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FirstStreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        //ITERATION 1 - Using for each and list
        List<Integer> evenNum = new ArrayList<>();
        for (int num : numbers) {
            if(num % 2 == 0) evenNum.add(num);
        }
        System.out.println("Even number without using streams : "+evenNum);

        //ITERATION 2 : Using streams
//        Stream<Integer> stream1 = numbers.stream();//source
//        Stream<Integer> stream2 = stream1.filter(p1);//Intermediate Operations
//        List<Integer> evenNumber = stream2.toList();// Terminal Operations
//        System.out.println("Even number with using streams : "+evenNumber);

        //ITERATION 3
        System.out.println("Even number with using streams : "+
                numbers.stream() // source
                .filter(p1)// intermediate
                .toList());//terminal

        //ITERATION 4
        System.out.println("Here you can find a even number in just one line");
        System.out.println("Even number with using streams : "+numbers.stream().filter(n-> n%2 == 0).toList());



    }
    static public Predicate<Integer> p = new Predicate<Integer>() {
        @Override
        public boolean test(Integer integer) {
            if(integer % 2 == 0) return true;
            return false;
        }
    };
    static public Predicate<Integer> p1 = (integer) -> (integer % 2 == 0);
}

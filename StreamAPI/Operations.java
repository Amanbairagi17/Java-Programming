package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Operations {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(24, 5, 64, 2, 1, 3);

//        Predicate<Integer> p = new Predicate<Integer>() {
//            public boolean test(Integer n) {
//                return n%2==0;
//            }
//        };
        Predicate<Integer> p = (n)->n%2==0;

//        Function<Integer,Integer> fn = new Function<Integer, Integer>() {
//
//            public Integer apply(Integer n) {
//                return n*2;
//            }
//        };
        Function<Integer,Integer> fn =(n) -> n*2;



//        Stream<Integer> s1 = nums.stream();
//        Stream<Integer> s2 = s1.filter(p);
//        Stream<Integer> s3 = s2.map(fn);
//        int ans = s3.reduce(0,(c,e) -> c+e);
//        System.out.println(ans);

        Stream<Integer> sortedVal = nums.stream().filter(n -> n%2==0).sorted();
        sortedVal.forEach(n -> System.out.println(n));







//        Stream<Integer> s1 = nums.stream();
//        Stream<Integer> s2 = s1.filter(n -> n%2==0);
//        Stream<Integer> s3 = s2.map(n -> n*2);
//        int ans = s3.reduce(0,(c,e) -> c+e);
//        System.out.println(ans);
    }
}

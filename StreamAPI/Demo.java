package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(24, 5, 64, 2, 1, 3);

        //using Consumer with reference
//        Consumer<Integer> con = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer n) {
//                System.out.println(n +" ");
//            }
//        };
//        nums.forEach(con);
        //using Consumer with lambda expression
//        Consumer<Integer> con = (n) -> System.out.println(n +" ");
//        nums.forEach(con);
        //using lambda expression and passing directly
//         nums.forEach(n -> System.out.print(n + " "));



//        just for fun
//        int sum=0;
//        for (int n : nums){
//            if (n%2==0){
//                n = n*2;
//                sum = sum+n;
//            }
//            System.out.print(n+" ");
//            System.out.println();
//
//        }
//        System.out.println(sum);


//        Stream<Integer> s1 = nums.stream();
//        Stream<Integer> s2 = s1.filter(n -> n%2==0);
//        Stream<Integer> s3 = s2.map(n -> n*2);
//        int ans = s3.reduce(0,(c,e) -> c+e);

        int ans = nums.stream().filter(n -> n % 2 == 0).map(n -> n*2).reduce(0,(c,e) -> c+e);
        System.out.println(ans);


    }
}

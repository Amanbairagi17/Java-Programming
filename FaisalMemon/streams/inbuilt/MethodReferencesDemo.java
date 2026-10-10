package FaisalMemon.streams.inbuilt;

import java.util.Arrays;
import java.util.List;

public class MethodReferencesDemo {//::
    //Method References in Java are a shortcut for lambda expressions that directly refer to a method by its name.
    //They make code cleaner and more readable.
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aman", "Bob", "Clarke");

        // Using for loop
        System.out.println("Using for loop");
        for(int i=0 ; i< names.size() ; i++){
            System.out.println(names.get(i));
        }

        //Using Enhanced for - For Each
        System.out.println("Using enhanced for loop");
        for(String name : names) System.out.println(name);

        System.out.println("using functional interface");
        //step 1
//        names.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String name) {
//                System.out.println(name);
//            }
//        });

//        //Step 2
//        names.forEach((String name) -> {
//                System.out.println(name);
//        });

        //Step 3
        names.forEach((name) -> System.out.println(name));

       // method reference
        System.out.println("Using Method Reference");
        names.forEach(System.out::println);
    }
}

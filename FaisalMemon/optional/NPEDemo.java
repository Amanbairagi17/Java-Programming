package FaisalMemon.optional;

import java.util.Optional;

public class NPEDemo {
    public static void main(String[] args) {
        String str = null;
       if(str != null){
           System.out.println(str.length());
       }
       else System.out.println("Null values");

       //Optional
        Optional<String> optionalString = Optional.of("Aman");// If you are entring null value in of then it will crash program
        System.out.println(optionalString);

        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        Optional<String> mayBe = Optional.ofNullable(null);
        System.out.println(mayBe);

        //Checking Values
        System.out.println(optionalString.isPresent());
        System.out.println(mayBe.isPresent());

        System.out.println(emptyOptional.isEmpty());
        System.out.println(optionalString.isEmpty());

        //GET
        System.out.println(optionalString.get());
        try {
            System.out.println(mayBe.get());
        }
        catch (Exception e) {
            System.out.println("Exception");
        }


        //orElse("default-value")
        System.out.println(optionalString.orElse("default"));
        System.out.println(mayBe.orElse("default"));
        System.out.println(emptyOptional.orElse("default"));

        //orElseGet(<supplier>)
        String result = emptyOptional.orElseGet(() -> {
            System.out.println("Hello Supplier Optional");
            return "default";
            }
        );
        System.out.println(result);

        //orElseThrow(throw exception)
        //String s = emptyOptional.orElseThrow(() -> new RuntimeException("Not Found"));
        String s = optionalString.orElseThrow(() -> new RuntimeException("Not Found"));
        System.out.println(s);

    }
}

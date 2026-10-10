package OOPsinJava.ExceptionHandling;
class AmanException extends Exception{
    public AmanException(String str){
        super(str);
    }
}
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class CustomException {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above!");
        }
        System.out.println("Eligible for voting.");
    }

    public static void main(String[] args) {
//        int i=0;
//        int j=0;
//
//        try {
//            j=18/20;
//
//            if (j==0) throw new AmanException("Throw Excpetion");
//            System.out.println("That's the default output");
//        }
//        catch (AmanException e){
//            System.out.println("My own Exception "+e);
//        }
//        catch (Exception e){
//            System.out.println("Something went wrong...");
//        }
//        System.out.println(j);
//        System.out.println("End of the program");
        try {
            checkAge(16); // Throws custom exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

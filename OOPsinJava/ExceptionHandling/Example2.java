package OOPsinJava.ExceptionHandling;

public class Example2 {
    public static void main(String[] args) {
        int i=0;
        int j=0;

        try {
            j=18/20;

            if (j==0) throw new ArithmeticException("Throw Excpetion");
            System.out.println("That's the default output");
        }
        catch (ArithmeticException e){
            System.out.println("You cannot divide by zero"+e);
        }
        catch (Exception e){
            System.out.println("Something went wrong...");
        }
        System.out.println(j);
        System.out.println("End of the program");
    }
}

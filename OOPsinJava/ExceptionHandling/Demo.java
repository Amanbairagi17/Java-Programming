package OOPsinJava.ExceptionHandling;

public class Demo {
    public static void main(String[] args) {
        int i=3;
        int j=0;
        int[] arr = new int[5];
        String s = null;

        try {//try to execute the program if there is no error then well program run but there is an error then
            //throws an exception that handled by catch block
            j=18/i;
            System.out.println(arr[2]);
            System.out.println(arr[5]);
            System.out.println(s.length());

        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by zeros");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You are accessing wrong index");
        }
        catch (Exception e){
            System.out.println("Something went wrong ");
        }
        System.out.println(j);
        System.out.println("End of the program");
    }
}

package FaisalMemon.exception;

public class ExceptionsDemo {
    public static void main(String[] args) {
        int[] arr = {9,0,33,4};
        try {
            int res = 10/1;
            System.out.println("No Exception");
            System.out.println(arr[8] + "Accessible index");
            //EXCEPTION GENERATING STATEMENT
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Element not Accessible, Exception caught");
            //EXCEPTION HANDLING STATEMENT
        }catch (Exception e){
            System.out.println("Exception");
        }
        finally {
            //ALWAYS EXECUTE FOR CLOSING RESOURCES
            System.out.println("Run Every time");
        }
    }
}

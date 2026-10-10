import java.util.Scanner;

public class Practice {
    private static int addition(int a, int b){
        return a + b;
    }
    private static int substraction(int a, int b){
        return a-b;
    }
    private static int multiplication(int a, int b){
        return a*b;
    }
    private static int division(int a, int b){
        return a/b;
    }
    private static int formod(int a, int b){
        return a%b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int check = 1;


        while (check != 0){
            System.out.println("Enter a number for performing operation");
            System.out.println("For addition Enter 1 : ");
            System.out.println("For Subtraction enter 2 : ");
            System.out.println("For Multiplication enter 3 : ");
            System.out.println("For Division enter 4 : " );
            System.out.println("For Mod enter 5 : ");

            System.out.print("Enter operation which one you want  : ");

            int n = sc.nextInt();


            System.out.println("Enter two values : ");
            System.out.print("Value 1 : ");
            int a = sc.nextInt();
            System.out.print("Value 2 : ");
            int b = sc.nextInt();
            switch (n){
                case 1 :
                    System.out.println(addition(a,b));
                    break;
                case 2 :
                    System.out.println(substraction(a,b));
                    break;
                case 3 :
                    System.out.println(multiplication(a,b));
                    break;
                case 4 :
                    System.out.println(division(a,b));
                    break;
                case 5 :
                    System.out.println(formod(a,b));
                    break;
                default:
                    System.out.println(a +" " +b);
            }
            System.out.println(" For Exit enter 0 : ");
            System.out.println("For more operation enter any number : ");
            check = sc.nextInt();
        }
    }
}

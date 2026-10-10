import java.util.Scanner;

public class numbersystem {

    static void decimalToBinary(int n){
        int[] x = new int[15];
        int i=0,j;
        while (n!=0){
            x[i]=n%2;
            n=n/2;
            i++;


        }
        for (j=i-1;j>=0;j--){
            System.out.print(x[i]);

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any decimal number : ");
        int n = sc.nextInt();

        decimalToBinary(n);


    }
}

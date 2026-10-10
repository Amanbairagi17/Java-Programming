package College;

import java.util.Scanner;

public class CheckIfFibbonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int sum = 0;
        for(int i=0 ; i<str.length() ; i++){
            sum += str.charAt(i) - '0';
        }

        int prev = 0;
        int next = 1;

        while (next < sum){
            int curr = prev+next;
            prev = next;
            next = curr;


        }
        if(next == sum) System.out.println(str+sum);
        else System.out.println(str+next);

    }
}

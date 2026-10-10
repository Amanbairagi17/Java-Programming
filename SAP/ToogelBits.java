package SAP;

import java.util.Scanner;

public class ToogelBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        String str = Integer.toBinaryString(x);
        String ans = "";

        for (char c : str.toCharArray()){
            if(c == '0') ans += 1;
            else ans += 0;
        }
        System.out.println(Integer.parseInt(ans,2));
    }
}

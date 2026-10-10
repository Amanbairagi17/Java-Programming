package SAP;

import java.util.Scanner;

public class LongestCommonSubsequenceSAP3 {
//    private static String helper(int i, int j, String str1, String str2){
//        if(i == str1.length() || j == str2.length()) return "";
//
//        if(str1.charAt(i) == str2.charAt(j)) return str1.charAt(i) + helper(i+1,j+1,str1,str2);
//        else
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(helper(str1,str2,str1.length(),str2.length()));
    }

    private static int helper(String str1, String str2, int m, int n) {
        if(m==0 || n==0) return 0;

        if(str1.charAt(m-1) == str2.charAt(n-1)) {
            return 1 + helper(str1, str2, m - 1, n - 1);
        }
        else
            return Math.max(helper(str1,str2,m,n-1),helper(str1,str2,m-1,n));
    }
}

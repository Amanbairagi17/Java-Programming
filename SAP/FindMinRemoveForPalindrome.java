package SAP;

import java.util.Arrays;

public class FindMinRemoveForPalindrome {
    private static int[][] dp;
    private static int longestPalindromicSubSeq(int i, int j, String str){
        if(i == j)return 1;
        if(i > j)return 0;

        if(dp[i][j] != -1) return dp[i][j];

        if(str.charAt(i) == str.charAt(j))return longestPalindromicSubSeq(i+1, j-1, str)+2;
        return dp[i][j] = Math.max(longestPalindromicSubSeq(i+1, j, str), longestPalindromicSubSeq(i, j-1, str));
    }
    private static int getMin(String str){
        int n = str.length();
        dp = new int[n][n];

        for(int i = 0; i < n; i++) Arrays.fill(dp[i], -1);
        return n-longestPalindromicSubSeq(0, n-1, str);
    }
    public static void main(String[] args) {
        System.out.println(getMin("aebcbda"));
    }
}

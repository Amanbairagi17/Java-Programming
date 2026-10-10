package DP;

import java.util.Arrays;

public class BasicsOfDP {
    static int calls;
    private static int fibbo(int n, int[] dp){
        if (n==0 || n==1) return 1;
        if (dp[n]!=-1) return dp[n];
        calls++;
//        int res = fibbo(n-1,dp)+fibbo(n-2,dp);
//        dp[n]=res;// with dp 9 call without memoization 15 calls
//        return res;
        return dp[n]=fibbo(n-1,dp)+fibbo(n-2,dp);
    }
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n+2];
        Arrays.fill(dp,-1);
        System.out.println(fibbo(n,dp));
        System.out.println(calls);
    }
}

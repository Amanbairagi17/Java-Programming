package DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinChange {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(5);
        nums.add(3);
        nums.add(6);

        int sum=10;
        int n = nums.size();
        int[][] dp = new int[n+1][sum+1];
        for (int i=0 ; i<=n ; i++){
            for (int j=0 ; j<=sum ; j++){
                dp[i][j]=-1;
            }
        }

        System.out.println(memoization(nums,sum,n-1,dp));
        //System.out.println(rec(nums,sum,n-1));
    }

//    private static int rec(List<Integer> nums, int sum, int i) {
//        if(i==0){
//            if(sum% nums.get(i)==0) return 1;
//            else return 0;
//        }
//        int pick=0;
//        if(sum>= nums.get(i)){
//            pick = rec(nums,sum- nums.get(i),i);
//        }
//        int notPick = rec(nums,sum,i-1);
//
//        return pick+notPick;
//    }
    private static int memoization(List<Integer> nums, int sum, int i, int[][] dp) {
        if (i == 0) {
            return (sum % nums.get(i) == 0) ? 1 : 0;
        }

        if (dp[i][sum] != -1) {
            return dp[i][sum];
        }

        int pick = 0;
        if (sum >= nums.get(i)) {
            pick = memoization(nums, sum - nums.get(i), i, dp);
        }

        int notPick = memoization(nums, sum, i - 1, dp);

        return dp[i][sum] = pick + notPick;
    }
}

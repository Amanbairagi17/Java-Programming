package StringQuestion;

public class LongestCommonSubstrings {
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "zcdemf";

        int m = str1.length();
        int n = str2.length();
        int maxlength = 0;
        int end = 0;

        int[][] dp = new int[m+1][n+1];

        for(int i=1 ; i<=m ; i++){
            for (int j=1 ; j<=n ; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                    if(dp[i][j] > maxlength){
                        maxlength = dp[i][j];
                        end = i;
                    }
                    else dp[i][j] = 0;
                }
            }
        }
        System.out.println(str1.substring(end-maxlength,end));
    }
}

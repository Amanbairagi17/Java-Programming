package StringQuestion;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {

        String str = "dcbbcd";
        int n = str.length();

        boolean[][] dp = new boolean[n][n];

        int maxLength = 1;
        int start = 0;

        // Length 1 palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // Length >= 2
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;

                if (str.charAt(i) == str.charAt(j)) {
                    if (len == 2 || dp[i + 1][j - 1]) {
                        dp[i][j] = true;

                        if (len > maxLength) {
                            maxLength = len;
                            start = i;
                        }
                    }
                }
            }
        }

        System.out.println(maxLength + " : " + str.substring(start, start + maxLength));
    }
}

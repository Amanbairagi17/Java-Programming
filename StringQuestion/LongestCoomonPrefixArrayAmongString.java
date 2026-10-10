package StringQuestion;

public class LongestCoomonPrefixArrayAmongString {
    private static int solve(String str1, String str2){
        int length = Math.min(str1.length(), str2.length());
        int idx = 0;

        while(idx < length && str1.charAt(idx) == str2.charAt(idx)){
            idx++;
        }
        return idx;
    }
    public static String longestCommonPrefix(String[] str) {
        int n = str.length;
        String res = str[0];

        for (int i = 1; i < n; i++) {
            int length = solve(res, str[i]);
            res = res.substring(0, length);
        }
        return res;
    }
    public static void main(String[] args) {
        String[] arr = {"flower","flow","flight"};
       // System.out.println(longestCommonPrefix(arr));

        if (arr == null || arr.length == 0) System.out.println("");
        String prefix = arr[0];
        for (String s : arr) {
            while (s.indexOf(prefix) != 0)
                prefix = prefix.substring(0, prefix.length() - 1);
        }
        System.out.println(prefix);
    }
}

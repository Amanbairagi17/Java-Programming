package StringQuestion;

public class LongestSubstrngWithoutRepeatingChar {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        int n = s.length();
        int maxlength = 0;
        boolean[] visited = new boolean[26];
        int start = 0;
        int end = 0;

        while (end < n){
            while (visited[s.charAt(end) -'a'] == true){
                visited[s.charAt(start) -'a'] = false;
                start++;
            }
            visited[s.charAt(end) -'a'] = true;
            maxlength = Math.max(maxlength,end-start+1);
            end++;
        }
        System.out.println(maxlength);
    }
}

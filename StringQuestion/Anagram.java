package StringQuestion;

public class Anagram {
    private static boolean isEqual(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length) return false;

        for(int i=0 ; i<arr1.length ; i++){
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    private static boolean isAnagram(String s, String t) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(char ch : s.toCharArray()) freq1[ch - 'a']++;
        for(char ch : t.toCharArray()) freq2[ch - 'a']++;

        if(isEqual(freq1,freq2)) return true;
        return false;
    }
    public static void main(String[] args) {
        String s1 = "amann";
        String s2 = "naman";
        System.out.println(isAnagram(s1,s2));
    }
}

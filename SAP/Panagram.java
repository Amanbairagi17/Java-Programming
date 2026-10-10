package SAP;

import java.util.HashSet;
import java.util.Scanner;

public class Panagram {
    private static boolean isValid(int[] arr){
        for (int num : arr){
            if(num == 0) return false;
        }
        return true;
    }
    private static void isPanagram(String str){
        int[] freq = new int[26];

        for(char c : str.toCharArray()){
            freq[c-'a']++;
        }

        if(isValid(freq)){
            System.out.println("no");
        }
        else System.out.println("yes");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abcdefghijklmnopqrstuvwzyZ";
        //isPanagram(str);
        HashSet<Character> st = new HashSet<>();
        for (char c: str.toCharArray()){
            char ch1 = Character.toLowerCase(c);
            int idx = (int)(ch1-'a');
            if(idx >= 0 && idx <= 25)st.add(ch1);
        }
        if(st.size() == 26) System.out.println("yes");
        else System.out.println("no");
    }



}

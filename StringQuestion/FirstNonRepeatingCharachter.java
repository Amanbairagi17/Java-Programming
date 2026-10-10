package StringQuestion;

import java.util.HashMap;
import java.util.HashSet;

public class FirstNonRepeatingCharachter {
    public static void main(String[] args) {
        String str = "AnanBairagi";
        HashMap<Character,Integer> mp = new HashMap<>();
        for(char c : str.toCharArray()){
            char ch = Character.toLowerCase(c);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        boolean check = false;
        char ans = ' ';
        for(char key : mp.keySet()){
            if(mp.get(key) == 1){
                ans = key;
                check = true;
                break;
            }
        }
        if(check) System.out.println(ans);
        else System.out.println(ans);
    }
}

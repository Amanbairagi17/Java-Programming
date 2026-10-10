package StringQuestion;

import java.util.HashMap;

public class FrequecyCharacters {
    public static void main(String[] args) {
        String str = "AmanBairagi= jii How Are u Man ??";
        HashMap<Character,Integer> mp = new HashMap<>();
        for(char ch : str.toCharArray()) mp.put(ch,mp.getOrDefault(ch,0)+1);
        for(char ch : mp.keySet()){
            System.out.println(ch +" is " +mp.get(ch) + " times");
        }
    }
}

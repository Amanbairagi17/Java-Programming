package StringQuestion;

import java.util.HashMap;
import java.util.HashSet;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {
        String str = "Aman  Bairagi ";
        HashSet<Character> set = new HashSet<>();

        for(char ch : str.toCharArray()){
            if(ch == ' ') continue;
            if(set.contains(ch)){
                System.out.println(ch);
                break;
            }
            set.add(ch);

        }

    }
}

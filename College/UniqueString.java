package College;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // String str = sc.next();
        String s = "abcdeeeaartg";

        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int count = 0;

        for (char key : map.keySet()){
            int value = map.get(key);
            if(value == 1) count++;
        }
        System.out.println(count);


    }
}

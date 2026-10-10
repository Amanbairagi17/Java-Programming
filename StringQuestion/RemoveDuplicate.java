package StringQuestion;

import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s = "AmanBairragi";
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(!set.contains(ch)){
                sb.append(ch);
            }else{
                set.remove(ch);
            }
            set.add(ch);
        }
        System.out.println(sb);
    }
}

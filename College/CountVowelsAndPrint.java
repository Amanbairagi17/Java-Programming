package College;

import java.util.HashMap;
import java.util.Scanner;

public class CountVowelsAndPrint {
    private static boolean isVowels(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||
           ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String str = sc.nextLine();
        String str = "Hii Welcome";

        HashMap<Character, Integer> mp = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(isVowels(ch)){
                mp.put(Character.toLowerCase(ch),mp.getOrDefault(Character.toLowerCase(ch),0)+1);
            }
            else{
                sb.append(ch);
            }


        }

        for(char key : mp.keySet() ){
            System.out.println(key + " : " + mp.get(key));
        }

        System.out.println(sb);

    }
}

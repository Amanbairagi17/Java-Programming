package SAP;

import java.util.HashMap;
import java.util.Scanner;

public class StringCompressionSAP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        HashMap<Character,Integer> freq = new HashMap<>();
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            freq.put(Character.toLowerCase(ch),freq.getOrDefault(Character.toLowerCase(ch),0)+1);
        }

        StringBuilder sb = new StringBuilder();
        for (char key : freq.keySet()){
            sb.append(key);
            sb.append(freq.get(key));
        }

        System.out.println(sb.toString());
        //Your Answer is not correct it not following all set rules of problem make correct
    }
}


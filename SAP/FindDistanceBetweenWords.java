package SAP;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class FindDistanceBetweenWords {
    private static int findDistance(String[] str,String word1,String word2){
        int i=0 ;
        int j=str.length-1;
        int idx1 = 0;
        int idx2 = 0;
        int min = Integer.MAX_VALUE;

        while(i<j){
            if(str[i].equals(word1)) idx1=i;
            if(str[j].equals(word2)) idx2=j;

            min = Math.min(min, idx2-idx1+1);
            i++;
            j--;
        }
        return min;

    }
    private static String prefixString(String[] words){
        HashSet<String> set = new HashSet<>();
        set.add("");
        String res = "";

        for (String word : words){
            String prefix = word.substring(0, word.length()-1);
            if(set.contains(prefix)) res = prefix;
        }
        return res;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n ");
//        int n = sc.nextInt();
       // String[] str = new String[n];

//        for(int i=0 ; i<n ; i++){
//            str[i] = sc.next();
//        }
//        String word1 = sc.next();
//        String word2 = sc.next();
         String[] str = {"geeks", "gee", "geeks","geezer ", "geer"};
//        String word1 = "geeks";
//        String word2 = "practice";
        //System.out.println(findDistance(str,word1,word2));
        System.out.println(prefixString(str));

    }
}

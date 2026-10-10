package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class printPermutation {
    static int counter = 0;

    public static void printP(String  str , String t,List<String> l){

        if (str.equals("")){
            counter++;
//            System.out.print(t+" ");
            l.add(t);
            return;
        }
        for (int i=0 ; i< str.length();i++){
            char ch = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            String rem = left+right;
            printP(rem,t+ch,l);

        }
    }
    public static void main(String[] args) {
        String str ="abcd";
        List<String> l = new ArrayList<>();
        printP(str,"",l);
//        System.out.println(l);//print list without using for loop
        for (int i=0 ; i<l.size() ;i++){// printing the list using for loop
            System.out.print(l.get(i)+" ");
        }
        System.out.println();
        System.out.println("Number of permutations : "+counter);
    }
}

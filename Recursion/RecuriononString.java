package Recursion;

import java.util.Scanner;

public class RecuriononString {

    static boolean isPalindrome(String s , int l , int r){
        if(l>=r) return true;
        return (s.charAt(l)==s.charAt(r) && isPalindrome(s,l+1,r-1));
    }
    static String reverse(String s,int idx){
        if(idx == s.length()) return "";
        return  reverse(s,idx+1)+s.charAt(idx) ;
    }
    static String reverse2(String s){//with out index
        if(s.length()==0) return "";
        return reverse2(s.substring(1))+s.charAt(0);
    }
    static  String removeA2(String s){
        if(s.length()==0) return "";

        String smallAns = removeA2(s.substring(1));

        char currChar = s.charAt(0);

        if(currChar != 'a') return currChar+smallAns;

        return smallAns;
    }
    static String removeA(String s,int idx){
        if(idx == s.length()) return "";

        String smallAns= removeA(s,idx+1);

        char currChar = s.charAt(idx);

        if(currChar != 'a') return currChar+smallAns;

     return smallAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        System.out.println(removeA(str,0));
//        System.out.println(removeA2(str));
//        System.out.println(reverse(str,0));
//        System.out.println(reverse2(str));
//        System.out.println(isPalindrome(str,0, str.length()-1));

    }
}

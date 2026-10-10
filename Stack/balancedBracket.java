package Stack;

import java.util.Scanner;
import java.util.Stack;

public class balancedBracket {
    public static int balancedBrackets(String str){
        Stack<Character> st= new Stack<>();
        int n = str.length();
        int count=0;
        for (int i=0 ;i<n ; i++){
            char ch = str.charAt(i);
            if (ch=='(') st.push(ch);
            else {//ch==')'
                if (st.empty()) count++;
                else if(')' == ch) st.pop();
            }
        }
         return count+st.size();
    }
    public static boolean isBalanced(String str){
        Stack<Character> st= new Stack<>();
        int n = str.length();
        for (int i=0 ;i<n ; i++){
            char ch = str.charAt(i);
            if (ch=='(') st.push(ch);
            else {//ch==')'
                if (st.empty()) return false;
                if (ch==')') st.pop();
            }
        }
        if (!st.isEmpty()) return false;
        else return true;
    }

    //**  Leet Trees.Code 20 - IsValid
/*    public static boolean isMacthing(char open , char close){
        if (open=='(' && close==')' || open=='[' && close=='[' || open=='{' && close=='}')
            return true;
        return false;
    }
    public static boolean isValid(String str){
        Stack<Character> st= new Stack<>();
        int n = str.length();
        for (int i=0 ;i<n ; i++){
            char ch = str.charAt(i);
            if (ch=='(') st.push(ch);
            else {//ch==')'
                if (st.empty()) return false;
                char top= st.pop();
                if (!isMacthing(top,ch)){
                    return false;
                }
            }
        }
        if (!st.isEmpty()) return false;
        else return true;
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
      //  System.out.println(isBalanced(str));
        System.out.println(balancedBrackets(str));
    }
}

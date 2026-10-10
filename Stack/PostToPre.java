package Stack;

import java.util.Stack;

public class PostToPre {
    public static void main(String[] args) {
        String str = "6435+*/9-";
        Stack<String> val = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 48 && ascii <= 57) {
                val.push(ch + "");
            } else {
                String v2 = val.pop();
                String v1 = val.pop();
                char op = ch;
                String t = op + v2 + v1;
                val.push(t);
            }
        }
        System.out.println(val.peek());
    }
}

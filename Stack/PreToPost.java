package Stack;

import java.util.Stack;

public class PreToPost {
    public static void main(String[] args) {
        String str="-/6*4+359";
        Stack<String> st=new Stack<>();
        for (int i=str.length()-1 ; i>=0 ;i--){
            char ch = str.charAt(i);
            int ascii = (int) ch;
            if(ascii>=48 && ascii<=57){
                st.push(ch+"");
            } else{
                String v1=st.pop();
                String v2=st.pop();
                char op = ch;
                // v1 v2 op
                String t = v1+v2+op;
                st.push(t);

            }
        }
        System.out.println(st.peek());
    }
}

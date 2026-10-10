package Stack;

import java.util.Stack;

public class reverseStack {
    public static void pushAtBottom(Stack<Integer> st ,int x){
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st,x);
        st.push(top);
    }
    public static void revese(Stack<Integer> st){
        if (st.size()==1) return;
        int top = st.pop();
        revese(st);
        pushAtBottom(st,top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        revese(st);
        System.out.println(st);
    }
}

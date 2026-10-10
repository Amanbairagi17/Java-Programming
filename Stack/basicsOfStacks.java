package Stack;

import java.util.Stack;

public class basicsOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();// Stack works on the principle last in first out / first in last out
        //System.out.println(st.size());
        st.push(1);
        st.push(4);
        st.push(99);
        st.push(3);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.size());
        st.pop();
        System.out.println(st);
        System.out.println(st.isEmpty());
        System.out.println(st);
        //how to get first element of stack
        while (st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());

    }
}

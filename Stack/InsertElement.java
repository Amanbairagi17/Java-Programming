package Stack;

import java.util.Stack;

public class InsertElement {
    public static void insertAtBottomRec(Stack<Integer> st ,int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top = st.pop();
        insertAtBottomRec(st,x);
        st.push(top);
    }
    public static void removeAtBottomRec(Stack<Integer> st ){
        if(st.size()==1){
            st.pop();
            return;
        }
        int top = st.pop();
        removeAtBottomRec(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        int x=8;
        insertAtBottomRec(st,x);
        System.out.println(st);
        removeAtBottomRec(st);
        System.out.println(st);

//         int idx = 2;
//         int x=7;
//    Stack<Integer> temp = new Stack<>();
//    while (st.size()>2){
//        temp.push(st.pop());
//    }
//    st.push(x);
//    while (!temp.isEmpty()){
//        st.push(temp.pop());
//    }
//        System.out.println(st);
//    }
    }
}

package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class reverseFirstKElement {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(2);
        q.add(4);
        q.add(5);
        q.add(9);
        q.add(1);
        int n = q.size();
        int k=3;
        System.out.println(q);
        Stack<Integer> st = new Stack<>();
        while (q.size()>n-k){
            st.push(q.remove());
        }
        while (st.size()>0){
            q.add(st.pop());
        }
        System.out.println(q);
        while (q.size()>k){
            st.push(q.remove());
        }
        Stack<Integer> temp = new Stack<>();
        while (st.size()>0){
            temp.add(st.pop());
        }
        while (temp.size()>0){
            q.add(temp.pop());
        }



        System.out.println(q);
    }
}

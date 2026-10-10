package CollectionFramework;

import java.util.ArrayList;
import java.util.Stack;

public class ListInterfaceExamples {
    public static void ArrayListExamples(){
        ArrayList<Integer> l =new ArrayList<>();
        l.add(1);
        l.add(4);
        l.add(5);
        l.add(10);
        System.out.println(l);//1, 4, 5, 10
        System.out.println(l.get(3));//10
        l.set(2,3);
        System.out.println(l);//1, 4, 3, 10
        System.out.println(l.contains(11));//false
    }
    public static void LinkedListExamples(){
        ArrayList<Integer> l =new ArrayList<>();
        l.add(1);
        l.add(4);
        l.add(5);
        l.add(10);
        System.out.println(l);//1, 4, 5, 10
        System.out.println(l.get(3));//10
        l.set(2,3);
        System.out.println(l);//1, 4, 3, 10
        System.out.println(l.contains(11));//false
    }
    public static void StackExamples(){
        Stack<String> st = new Stack<>();
        st.push("Hello");
        st.push("stack");
        st.push("Interface");
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.empty());
        System.out.println(st.size());
    }
    public static void main(String[] args) {
//        ArrayListExamples();
//        LinkedListExamples();
        StackExamples();
    }
}

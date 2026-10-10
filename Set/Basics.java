package Set;

import java.util.HashSet;

public class Basics {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("James");
        st.add("Anderson");
        st.add("James");
        st.add("Mark");
        st.add("Ben stokes");
        System.out.println(st);
        System.out.println(st.contains("James"));// true
        System.out.println(st.size());//4
        st.remove("James");
        System.out.println(st.contains("James"));// true
        System.out.println(st.size());//4
        for (String s : st){
            System.out.println(s);
        }
    }
}

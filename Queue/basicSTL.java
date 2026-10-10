package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class basicSTL {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> dq = new ArrayDeque<>();
        q.add(1);
        q.add(8);
        q.add(6);
        q.add(4);
        q.add(3);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        q.poll();
        System.out.println(q);
        System.out.println(q.element());
        System.out.println(q.size());
    }
}

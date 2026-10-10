package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(2);
        dq.addFirst(9);
        System.out.println(dq);
        dq.addLast(3);
        dq.add(9);//last se add
        System.out.println(dq);
        dq.remove();//first se delete
        dq.removeFirst();
        System.out.println(dq);
        System.out.println(dq.getFirst());
       // dq.removeAll(dq);//remove all element
        dq.removeFirstOccurrence(9);
        System.out.println(dq);
    }
}

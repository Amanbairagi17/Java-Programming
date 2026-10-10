package CollectionFramework;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> num = new ArrayDeque<>();
        num.offer(9);
        System.out.println(num);
        num.offerFirst(90);
        System.out.println(num);
        num.offerLast(999);
        System.out.println(num);
        num.pollLast();
        System.out.println(num.peekFirst());
        System.out.println(num.peekLast());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.addAll(num);
        System.out.println(pq.poll());
    }
}

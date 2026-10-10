package Heap;

import java.util.PriorityQueue;

public class CheckMinAndMaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(90);
        pq.add(5);
        pq.add(4);
        pq.add(44);
        pq.add(34);

        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}
